package com.chetan.TicketBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chetan.TicketBookingApp.response.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
