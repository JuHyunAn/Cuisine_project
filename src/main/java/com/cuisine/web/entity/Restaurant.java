package com.cuisine.web.entity;

public class Restaurant {
	private int id;
	private String name;
	private String address;
	private String phone;
	private String workingtime;
	private String breaktime;
	private int cleaness_toilet;
	private int cleaness_hall;
	private int parkinglot;
	

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(int id, String name, String address, String phone, String workingtime, String breaktime, int cleaness_toilet, int cleaness_hall, int parkinglot) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.workingtime = workingtime;
		this.breaktime = breaktime;
		this.cleaness_toilet = cleaness_toilet;
		this.cleaness_hall = cleaness_hall;
		this.parkinglot = parkinglot;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getWorkingtime() {
		return workingtime;
	}


	public void setWorkingtime(String workingtime) {
		this.workingtime = workingtime;
	}


	public String getBreaktime() {
		return breaktime;
	}


	public void setBreaktime(String breaktime) {
		this.breaktime = breaktime;
	}


	public int getCleaness_toilet() {
		return cleaness_toilet;
	}


	public void setCleaness_toilet(int cleaness_toilet) {
		this.cleaness_toilet = cleaness_toilet;
	}


	public int getCleaness_hall() {
		return cleaness_hall;
	}


	public void setCleaness_hall(int cleaness_hall) {
		this.cleaness_hall = cleaness_hall;
	}


	public int getParkinglot() {
		return parkinglot;
	}


	public void setParkinglot(int parkinglot) {
		this.parkinglot = parkinglot;
	}


	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", workingtime=" + workingtime + ", breaktime=" + breaktime + ", cleaness_toilet=" + cleaness_toilet
				+ ", cleaness_hall=" + cleaness_hall + ", parkinglot=" + parkinglot + "]";
	}
	
	
}
