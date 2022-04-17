package com.model;

import java.util.Date;

public class Donor {
	private String donorName;
	private String donorBloodGroup;
	private String  birthDate;
	private char gender;
	private double weight;
	private Area areaOfDonor;
	private long contactNo;
	
	public Donor(String donorName, String donorBloodGroup, String birthDate, char gender, double weight,
			Area areaOfDonor, long contactNo) {
		this.donorName = donorName;
		this.donorBloodGroup = donorBloodGroup;
		this.birthDate = birthDate;
		this.gender = gender;
		this.weight = weight;
		this.areaOfDonor = areaOfDonor;
		this.contactNo = contactNo;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonorBloodGroup() {
		return donorBloodGroup;
	}
	public void setDonorBloodGroup(String donorBloodGroup) {
		this.donorBloodGroup = donorBloodGroup;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Area getAreaOfDonor() {
		return areaOfDonor;
	}
	public void setAreaOfDonor(Area areaOfDonor) {
		this.areaOfDonor = areaOfDonor;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	


}
