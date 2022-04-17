package com.model;


import java.util.PriorityQueue;

public class Hospital {
	private String hospitalName;
	private Area loc;
	private int citycode;
	private int areacode;
	private int hospitalcode;
	PriorityQueue<Reciever> pq;
	Hospital (int code ,String hospitalName,int a_code,int c_code){
		this.hospitalcode = code;
		this.hospitalName = hospitalName;
		this.areacode = a_code;
		this.citycode = c_code;
	}
	public Hospital(String hospitalName, Area loc) {
		super();
		this.hospitalName = hospitalName;
		this.loc = loc;
		this.pq = pq;
	}
	public int getHospitalCode() {
		return hospitalcode;
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
