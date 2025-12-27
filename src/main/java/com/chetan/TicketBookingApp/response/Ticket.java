package com.chetan.TicketBookingApp.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JacksonXmlRootElement
public class Ticket {
	
	@Id
	private int tid;
	private String tStatus;
	private Double tprice;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public String gettStatus() {
		return tStatus;
	}
	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}
	public Double getTprice() {
		return tprice;
	}
	public void setTprice(Double tprice) {
		this.tprice = tprice;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid  + ", tStatus=" + tStatus + ", tprice=" + tprice + "]";
	}
	
	
	
	

}
