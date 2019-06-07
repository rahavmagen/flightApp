package com.spring.rahav.flightAppTest.Data;

import java.util.HashSet;

import org.springframework.stereotype.Component;

import com.spring.rahav.flightAppTest.models.Baggage;
import com.spring.rahav.flightAppTest.models.Coupon;
import com.spring.rahav.flightAppTest.models.Ticket;
import com.spring.rahav.flightAppTest.models.Traveler;

@Component
public class DataRepo {

	private HashSet<Traveler> travelersList = new HashSet<Traveler>();
	
	Traveler travelerA = new Traveler(new Baggage(10, "baggageA", false), new Ticket(100) , new Coupon(1000, 11.11) );
	Traveler travelerB = new Traveler(new Baggage(20, "baggageB", true), new Ticket(200) , new Coupon(2000, 22.22) );
	
	
	public DataRepo () {
		travelersList.add(travelerA);
		travelersList.add(travelerB);
	}

	public HashSet<Traveler> getTravelersList() {
		return travelersList;
	}
	
}
