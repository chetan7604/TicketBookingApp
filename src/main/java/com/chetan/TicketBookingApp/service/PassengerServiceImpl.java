package com.chetan.TicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetan.TicketBookingApp.repository.PassengerRepository;
import com.chetan.TicketBookingApp.repository.TicketRepository;
import com.chetan.TicketBookingApp.request.Passenger;
import com.chetan.TicketBookingApp.response.Ticket;

@Service
public class PassengerServiceImpl implements PassengerServiceI{

	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private TicketRepository ticketRepository;
	@Override
	public Ticket bookTicket(Passenger psg) {
		Passenger passenger = passengerRepository.save(psg);
		System.out.println(passenger);
		int pid = passenger.getPid();
		Ticket ticket = ticketRepository.findById(pid).get();
		return ticket;
		
	}

}
