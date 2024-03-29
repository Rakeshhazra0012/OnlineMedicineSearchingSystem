package com.cts.srcmed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int stockId;
@Column
private String stockLocId;
@Column
private String drugName;
@Column
private String company;
@Column
private String dose;

@Column
private String expDate;

public Stock() {
}
public Stock(int stockId, String stockLocId, String drugName, String company, String dose ,String expDate) {
	super();
	this.stockId = stockId;
	this.stockLocId = stockLocId;
	this.drugName = drugName;
	this.company = company;
	this.dose = dose;
	this.expDate = expDate;
}
public String getExpDate() {
	return expDate;
}
public void setExpDate(String expDate) {
	this.expDate = expDate;
}
public int getStockId() {
	return stockId;
}
public void setStockId(int stockId) {
	this.stockId = stockId;
}
public String getStockLocId() {
	return stockLocId;
}
public void setStockLocId(String stockLocId) {
	this.stockLocId = stockLocId;
}
public String getDrugName() {
	return drugName;
}
public void setDrugName(String drugName) {
	this.drugName = drugName;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getDose() {
	return dose;
}
public void setDose(String dose) {
	this.dose = dose;
}
@Override
public String toString() {
	return "stock [stockId=" + stockId + ", stockLocId=" + stockLocId + ", drugName=" + drugName + ", company="
			+ company + ", dose=" + dose + "]";
}

}

