package com.spring.rahav.flightAppTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.rahav.flightAppTest.services.TicketService;

@RestController
public class Controller {

	@Autowired
	TicketService ticketService;
	
	@RequestMapping("checkTicket/{ticketId}")
	
	public Boolean checkTicket (@PathVariable Integer ticketId) {
		
		return ticketService.checkTicketExist(ticketId);
		
	}
	
}
