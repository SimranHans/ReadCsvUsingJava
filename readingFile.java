package com.read.csv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date; // java.sql.Date for MySQL compatibility
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ReadCsvUsingBuffer {

    // Database URL and credentials
    

    public static void main(String[] args) {
        List<Dto> dtos = readCsvUsingBuffer("D:\\project Quant\\excelFile.csv");

     // Print out all DTOs for verification
        //for (Dto dto : dtos) {
          //  System.out.println(dto);
       // }

        // Convert list of DTOs to JSON
        convertToJson(dtos);
        
        
        // Insert data into MySQL
        insertDataIntoMySQL(dtos);
    }

     // Method to read CSV and return a list of DTOs
 	  private static List<Dto> readCsvUsingBuffer(String filePath) {
 		    List<Dto> dtos = new ArrayList<>();
 		    String line = "";
 		    boolean isFirstLine = true;

 		    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
 		        while ((line = reader.readLine()) != null) {
 		            if (isFirstLine) {
 		                isFirstLine = false;
 		                continue;  // Skip the header line
 		            }

 		            if (!line.trim().isEmpty()) {
 		                String[] userData = line.split(",");

 		                // Use default values or null for missing columns
 		                String firstName = userData.length > 0 && !userData[0].trim().isEmpty() ? userData[0] : null;
 		                String lastName = userData.length > 1 && !userData[1].trim().isEmpty() ? userData[1] : null;
 		                Integer age = userData.length > 2 && !userData[2].trim().isEmpty() ? Integer.parseInt(userData[2]) : null;
 		                Double salary = userData.length > 3 && !userData[3].trim().isEmpty() ? Double.parseDouble(userData[3]) : null;
 		                String date = userData.length > 4 && !userData[4].trim().isEmpty() ? userData[4] : null;

 		                Dto dto = new Dto(firstName, lastName, age, salary, date);
 		                dtos.add(dto);
 		            }
 		        }
 		    } catch (FileNotFoundException e) {
 		        e.printStackTrace();
 		    } catch (IOException e) {
 		        e.printStackTrace();
 		    }

 		    return dtos;
 		}
    
       
    
    // Method to convert list of DTOs to JSON
    private static void convertToJson(List<Dto> dtos) {
        Gson gson = new Gson();
        String json = gson.toJson(dtos);
        System.out.println("JSON Output: " + json);
    }
    
   
    // Method to insert DTOs into MySQL
    private static void insertDataIntoMySQL(List<Dto> dtos) {
        String insertQuery = "INSERT INTO tbl_exmpp (firstName, lastName, age, sal, dateof) VALUES (?, ?, ?, ?, ?)";
        
        String url = "jdbc:mysql://localhost:3306/db_exmp";
		String user = "root";
		String password = "root";
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

        	for (Dto dto : dtos) {
                pstmt.setString(1, dto.getFirstName());
                pstmt.setString(2, dto.getLastName());
                pstmt.setObject(3, dto.getAge() != null ? dto.getAge() : null);
                pstmt.setObject(4, dto.getSal() != null ? dto.getSal() : null);
                pstmt.setDate(5, dto.getDate() != null ? Date.valueOf(dto.getDate()) : Date.valueOf(LocalDate.of(1900, 1, 1))); // Set default date if null

                pstmt.addBatch();
            }

        	int[] updateCounts = pstmt.executeBatch(); // Execute all the batched statements
        	if(updateCounts==null) {
        		 System.out.println("oops something went wrong data not inserted !");
        	}else {
        		System.out.println("Data inserted successfully!");
        	}

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
