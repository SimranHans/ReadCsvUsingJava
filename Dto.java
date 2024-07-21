package com.read.csv;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Dto {

    private String firstName = "";
    private String lastName = "";
    private Integer age = 0;
    private Double sal;
    private LocalDate date;

    private static final DateTimeFormatter INPUT_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final LocalDate DEFAULT_DATE = LocalDate.of(1900, 1, 1); // Default date

    // Default constructor
    public Dto() {}
    

    // Parameterized constructor
    public Dto(String firstName, String lastName, Integer age, Double sal, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sal = sal;
        setDate(date);  // Use the setter to parse the date
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            try {
                this.date = LocalDate.parse(date, INPUT_DATE_FORMATTER);
            } catch (Exception e) {
                e.printStackTrace(); // Handle invalid date format
                this.date = DEFAULT_DATE; // Set default date if parsing fails
            }
        } else {
            this.date = DEFAULT_DATE; // Handle null or empty date string by setting default date
        }
    }

    @Override
    public String toString() {
        return "Dto [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sal=" + sal + ", date=" + (date != null ? date.toString() : "null") + "]";
    }
}
