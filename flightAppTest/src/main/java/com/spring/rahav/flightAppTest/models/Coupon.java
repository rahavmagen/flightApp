package com.spring.rahav.flightAppTest.models;

public class Coupon {

	private Integer couponId;
	private Double price; 

	
	public Coupon(Integer couponId, Double price) {
		super();
		this.couponId = couponId;
		this.price = price;
	}
	public Integer getCouponId() {
		return couponId;
	}
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
