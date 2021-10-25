package com.zerock.domain;

import java.util.Date;

public class BoardVO {
	private String DLV_DT;
	private String STOR_CD;
	private String ITEM_CD;
	private int ORD_QTY;
	private Date REG_DATE;
	private String REG_USER_ID;
	
	public String getDLV_DT() {
		return DLV_DT;
	}
	public void setDLV_DT(String dLV_DT) {
		DLV_DT = dLV_DT;
	}
	public String getSTOR_CD() {
		return STOR_CD;
	}
	public void setSTOR_CD(String sTOR_CD) {
		STOR_CD = sTOR_CD;
	}
	public String getITEM_CD() {
		return ITEM_CD;
	}
	public void setITEM_CD(String iTEM_CD) {
		ITEM_CD = iTEM_CD;
	}
	public int getORD_QTY() {
		return ORD_QTY;
	}
	public void setORD_QTY(int oRD_QTY) {
		ORD_QTY = oRD_QTY;
	}
	public Date getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(Date rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getREG_USER_ID() {
		return REG_USER_ID;
	}
	public void setREG_USER_ID(String rEG_USER_ID) {
		REG_USER_ID = rEG_USER_ID;
	}
	
	
}
