package com.read.csv;


public class Transaction {
    // Fields for all attributes including date fields as String
    private String TradDt;
    private String BizDt;
    private String Sgmt;
    private String Src;
    private String FinInstrmTp;
    private Long FinInstrmId; // Changed from Integer to Long
    private String ISIN;
    private String TckrSymb;
    private String SctySrs;
    private String XpryDt;
    private String FininstrmActlXpryDt;
    private Double StrkPric;
    private String OptnTp;
    private String FinInstrmNm;
    private Double OpnPric;
    private Double HghPric;
    private Double LwPric;
    private Double ClsPric;
    private Double LastPric;
    private Double PrvsClsgPric;
    private Double UndrlygPric;
    private Double SttlmPric;
    private Long OpnIntrst; // Changed from Integer to Long
    private Long ChngInOpnIntrst; // Changed from Integer to Long
    private Long TtlTradgVol; // Changed from Integer to Long
    private Double TtlTrfVal;
    private Long TtlNbOfTxsExctd; // Changed from Integer to Long
    private String SsnId;
    private Long NewBrdLotQty; // Changed from Integer to Long
    private String Rmks;
    private String Rsvd1;
    private String Rsvd2;
    private String Rsvd3;
    private String Rsvd4;

    // Constructor with all fields
    public Transaction(String TradDt, String BizDt, String Sgmt, String Src, String FinInstrmTp,
                       Long FinInstrmId, String ISIN, String TckrSymb, String SctySrs, String XpryDt,
                       String FininstrmActlXpryDt, Double StrkPric, String OptnTp, String FinInstrmNm,
                       Double OpnPric, Double HghPric, Double LwPric, Double ClsPric, Double LastPric,
                       Double PrvsClsgPric, Double UndrlygPric, Double SttlmPric, Long OpnIntrst,
                       Long ChngInOpnIntrst, Long TtlTradgVol, Double TtlTrfVal, Long TtlNbOfTxsExctd,
                       String SsnId, Long NewBrdLotQty, String Rmks, String Rsvd1, String Rsvd2, String Rsvd3,
                       String Rsvd4) {
        this.TradDt = TradDt;
        this.BizDt = BizDt;
        this.Sgmt = Sgmt;
        this.Src = Src;
        this.FinInstrmTp = FinInstrmTp;
        this.FinInstrmId = FinInstrmId;
        this.ISIN = ISIN;
        this.TckrSymb = TckrSymb;
        this.SctySrs = SctySrs;
        this.XpryDt = XpryDt;
        this.FininstrmActlXpryDt = FininstrmActlXpryDt;
        this.StrkPric = StrkPric;
        this.OptnTp = OptnTp;
        this.FinInstrmNm = FinInstrmNm;
        this.OpnPric = OpnPric;
        this.HghPric = HghPric;
        this.LwPric = LwPric;
        this.ClsPric = ClsPric;
        this.LastPric = LastPric;
        this.PrvsClsgPric = PrvsClsgPric;
        this.UndrlygPric = UndrlygPric;
        this.SttlmPric = SttlmPric;
        this.OpnIntrst = OpnIntrst;
        this.ChngInOpnIntrst = ChngInOpnIntrst;
        this.TtlTradgVol = TtlTradgVol;
        this.TtlTrfVal = TtlTrfVal;
        this.TtlNbOfTxsExctd = TtlNbOfTxsExctd;
        this.SsnId = SsnId;
        this.NewBrdLotQty = NewBrdLotQty;
        this.Rmks = Rmks;
        this.Rsvd1 = Rsvd1;
        this.Rsvd2 = Rsvd2;
        this.Rsvd3 = Rsvd3;
        this.Rsvd4 = Rsvd4;
    }

	public String getTradDt() {
		return TradDt;
	}

	public void setTradDt(String tradDt) {
		TradDt = tradDt;
	}

	public String getBizDt() {
		return BizDt;
	}

	public void setBizDt(String bizDt) {
		BizDt = bizDt;
	}

	public String getSgmt() {
		return Sgmt;
	}

	public void setSgmt(String sgmt) {
		Sgmt = sgmt;
	}

	public String getSrc() {
		return Src;
	}

	public void setSrc(String src) {
		Src = src;
	}

	public String getFinInstrmTp() {
		return FinInstrmTp;
	}

	public void setFinInstrmTp(String finInstrmTp) {
		FinInstrmTp = finInstrmTp;
	}

	public Long getFinInstrmId() {
		return FinInstrmId;
	}

	public void setFinInstrmId(Long finInstrmId) {
		FinInstrmId = finInstrmId;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getTckrSymb() {
		return TckrSymb;
	}

	public void setTckrSymb(String tckrSymb) {
		TckrSymb = tckrSymb;
	}

	public String getSctySrs() {
		return SctySrs;
	}

	public void setSctySrs(String sctySrs) {
		SctySrs = sctySrs;
	}

	public String getXpryDt() {
		return XpryDt;
	}

	public void setXpryDt(String xpryDt) {
		XpryDt = xpryDt;
	}

	public String getFininstrmActlXpryDt() {
		return FininstrmActlXpryDt;
	}

	public void setFininstrmActlXpryDt(String fininstrmActlXpryDt) {
		FininstrmActlXpryDt = fininstrmActlXpryDt;
	}

	public Double getStrkPric() {
		return StrkPric;
	}

	public void setStrkPric(Double strkPric) {
		StrkPric = strkPric;
	}

	public String getOptnTp() {
		return OptnTp;
	}

	public void setOptnTp(String optnTp) {
		OptnTp = optnTp;
	}

	public String getFinInstrmNm() {
		return FinInstrmNm;
	}

	public void setFinInstrmNm(String finInstrmNm) {
		FinInstrmNm = finInstrmNm;
	}

	public Double getOpnPric() {
		return OpnPric;
	}

	public void setOpnPric(Double opnPric) {
		OpnPric = opnPric;
	}

	public Double getHghPric() {
		return HghPric;
	}

	public void setHghPric(Double hghPric) {
		HghPric = hghPric;
	}

	public Double getLwPric() {
		return LwPric;
	}

	public void setLwPric(Double lwPric) {
		LwPric = lwPric;
	}

	public Double getClsPric() {
		return ClsPric;
	}

	public void setClsPric(Double clsPric) {
		ClsPric = clsPric;
	}

	public Double getLastPric() {
		return LastPric;
	}

	public void setLastPric(Double lastPric) {
		LastPric = lastPric;
	}

	public Double getPrvsClsgPric() {
		return PrvsClsgPric;
	}

	public void setPrvsClsgPric(Double prvsClsgPric) {
		PrvsClsgPric = prvsClsgPric;
	}

	public Double getUndrlygPric() {
		return UndrlygPric;
	}

	public void setUndrlygPric(Double undrlygPric) {
		UndrlygPric = undrlygPric;
	}

	public Double getSttlmPric() {
		return SttlmPric;
	}

	public void setSttlmPric(Double sttlmPric) {
		SttlmPric = sttlmPric;
	}

	public Long getOpnIntrst() {
		return OpnIntrst;
	}

	public void setOpnIntrst(Long opnIntrst) {
		OpnIntrst = opnIntrst;
	}

	public Long getChngInOpnIntrst() {
		return ChngInOpnIntrst;
	}

	public void setChngInOpnIntrst(Long chngInOpnIntrst) {
		ChngInOpnIntrst = chngInOpnIntrst;
	}

	public Long getTtlTradgVol() {
		return TtlTradgVol;
	}

	public void setTtlTradgVol(Long ttlTradgVol) {
		TtlTradgVol = ttlTradgVol;
	}

	public Double getTtlTrfVal() {
		return TtlTrfVal;
	}

	public void setTtlTrfVal(Double ttlTrfVal) {
		TtlTrfVal = ttlTrfVal;
	}

	public Long getTtlNbOfTxsExctd() {
		return TtlNbOfTxsExctd;
	}

	public void setTtlNbOfTxsExctd(Long ttlNbOfTxsExctd) {
		TtlNbOfTxsExctd = ttlNbOfTxsExctd;
	}

	public String getSsnId() {
		return SsnId;
	}

	public void setSsnId(String ssnId) {
		SsnId = ssnId;
	}

	public Long getNewBrdLotQty() {
		return NewBrdLotQty;
	}

	public void setNewBrdLotQty(Long newBrdLotQty) {
		NewBrdLotQty = newBrdLotQty;
	}

	public String getRmks() {
		return Rmks;
	}

	public void setRmks(String rmks) {
		Rmks = rmks;
	}

	public String getRsvd1() {
		return Rsvd1;
	}

	public void setRsvd1(String rsvd1) {
		Rsvd1 = rsvd1;
	}

	public String getRsvd2() {
		return Rsvd2;
	}

	public void setRsvd2(String rsvd2) {
		Rsvd2 = rsvd2;
	}

	public String getRsvd3() {
		return Rsvd3;
	}

	public void setRsvd3(String rsvd3) {
		Rsvd3 = rsvd3;
	}

	public String getRsvd4() {
		return Rsvd4;
	}

	public void setRsvd4(String rsvd4) {
		Rsvd4 = rsvd4;
	}

	@Override
	public String toString() {
		return "Transaction [TradDt=" + TradDt + ", BizDt=" + BizDt + ", Sgmt=" + Sgmt + ", Src=" + Src
				+ ", FinInstrmTp=" + FinInstrmTp + ", FinInstrmId=" + FinInstrmId + ", ISIN=" + ISIN + ", TckrSymb="
				+ TckrSymb + ", SctySrs=" + SctySrs + ", XpryDt=" + XpryDt + ", FininstrmActlXpryDt="
				+ FininstrmActlXpryDt + ", StrkPric=" + StrkPric + ", OptnTp=" + OptnTp + ", FinInstrmNm=" + FinInstrmNm
				+ ", OpnPric=" + OpnPric + ", HghPric=" + HghPric + ", LwPric=" + LwPric + ", ClsPric=" + ClsPric
				+ ", LastPric=" + LastPric + ", PrvsClsgPric=" + PrvsClsgPric + ", UndrlygPric=" + UndrlygPric
				+ ", SttlmPric=" + SttlmPric + ", OpnIntrst=" + OpnIntrst + ", ChngInOpnIntrst=" + ChngInOpnIntrst
				+ ", TtlTradgVol=" + TtlTradgVol + ", TtlTrfVal=" + TtlTrfVal + ", TtlNbOfTxsExctd=" + TtlNbOfTxsExctd
				+ ", SsnId=" + SsnId + ", NewBrdLotQty=" + NewBrdLotQty + ", Rmks=" + Rmks + ", Rsvd1=" + Rsvd1
				+ ", Rsvd2=" + Rsvd2 + ", Rsvd3=" + Rsvd3 + ", Rsvd4=" + Rsvd4 + "]";
	}

      
}


