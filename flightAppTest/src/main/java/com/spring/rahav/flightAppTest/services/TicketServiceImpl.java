package com.spring.rahav.flightAppTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rahav.flightAppTest.Data.DataRepo;
import com.spring.rahav.flightAppTest.models.Traveler;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	DataRepo dataRepo;

	@Override
	public Boolean checkTicketExist(Integer ticketId) {

		for (Traveler traveler : dataRepo.getTravelersList()) {

			if (traveler.getTicket().getTicketId() == ticketId) {
				return true;
			}

		}
		return false;

	}

}