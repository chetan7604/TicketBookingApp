package com.chetan.TicketBookingApp.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JacksonXmlRootElement
public class Passenger {
	
	@Id
	private int pid;
	private String fname;
	private String lname;
	private String fcity;
	private String tcity;
	private String doj;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFcity() {
		return fcity;
	}
	public void setFcity(String fcity) {
		this.fcity = fcity;
	}
	public String getTcity() {
		return tcity;
	}
	public void setTcity(String tcity) {
		this.tcity = tcity;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", fcity=" + fcity + ", tcity="
				+ tcity + ", doj=" + doj + "]";
	}
	
	

}
