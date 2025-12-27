package com.chetan.TicketBookingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.chetan.TicketBookingApp.request.Passenger;
import com.chetan.TicketBookingApp.response.Ticket;
import com.chetan.TicketBookingApp.service.PassengerServiceI;

@RestController
public class PassengerController {

	@Autowired
	private PassengerServiceI passengerServiceI;
	
	

	@PostMapping(value="/bookTicket",consumes = {"application/json","application/xml"},produces = {"application/json","application/xml"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg){
		Ticket bookTicket = passengerServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
		
	}
}
