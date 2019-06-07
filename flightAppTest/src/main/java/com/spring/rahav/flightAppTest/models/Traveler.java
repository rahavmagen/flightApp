package com.spring.rahav.flightAppTest.models;

public class Traveler {

	
	public Traveler(Baggage baggage, Ticket ticket, Coupon coupon) {
		super();
		this.baggage = baggage;
		this.ticket = ticket;
		this.coupon = coupon;
	}
	
	private Baggage baggage;
	private Ticket ticket;
	private Coupon coupon;
	
	
	public Baggage getBaggage() {
		return baggage;
	}
	public void setBaggage(Baggage baggage) {
		this.baggage = baggage;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

}
