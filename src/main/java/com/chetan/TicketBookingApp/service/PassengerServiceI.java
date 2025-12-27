package com.chetan.TicketBookingApp.service;

import com.chetan.TicketBookingApp.request.Passenger;
import com.chetan.TicketBookingApp.response.Ticket;

public interface PassengerServiceI {
	
	public Ticket bookTicket(Passenger psg);


}
