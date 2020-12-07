package com.cuisine.member.entity;

public class Member {
	private String userId;
	private String pwd;
	private int gender;
	private int age;
	private String email;
	private String address;

	public Member() {
	}
	
	public Member(String userId, String pwd, int gender, int age, String email, String address) {
		this.userId = userId;
		this.pwd = pwd;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pwd=" + pwd + ", gender=" + gender + ", age=" + age + ", email=" + email
				+ ", address=" + address + "]";
	}

}