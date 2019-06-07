package com.spring.rahav.flightAppTest.models;

public class Baggage {

	private Integer destId;
	private String baggageId;
	private  Boolean checkIndone;
	
	public Baggage(Integer destId, String baggageId, Boolean checkIndone) {
		super();
		this.destId = destId;
		this.baggageId = baggageId;
		this.checkIndone = checkIndone;
	}
	
	
	public Integer getDestId() {
		return destId;
	}
	public void setDestId(Integer destId) {
		this.destId = destId;
	}
	public String getBaggageId() {
		return baggageId;
	}
	public void setBaggageId(String baggageId) {
		this.baggageId = baggageId;
	}
	public Boolean getCheckIndone() {
		return checkIndone;
	}
	public void setCheckIndone(Boolean checkIndone) {
		this.checkIndone = checkIndone;
	}
 
	

	
	
}
