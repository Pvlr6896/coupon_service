package com.lokesh.spring.coupon.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coupon")
public class Coupon {

	private String code;
	private Double discount;
	private String expiryDate;

	public Coupon(String code, Double discount, String expiryDate) {
		this.code = code;
		this.discount = discount;
		this.expiryDate = expiryDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
