package com.model;


import java.util.PriorityQueue;

public class Hospital {
	private String hospitalName;
	private Area loc;
	PriorityQueue<Reciever> pq;
	public Hospital(String hospitalName, Area loc) {
		super();
		this.hospitalName = hospitalName;
		this.loc = loc;
		this.pq = pq;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Area getLoc() {
		return loc;
	}
	public void setLoc(Area loc) {
		this.loc = loc;
	}
	public PriorityQueue<Reciever> getPq() {
		return pq;
	}
	public void setPq(PriorityQueue<Reciever> pq) {
		this.pq = pq;
	}
	
	
}
