package com.cts.srcmed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="users")
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
@Column
private String designation;
@Column
private String fname;
@Column
private String lname;

@Column
private String address;
@Column
private String phone;
@Column
private String email;
@Column
private String username;
@Column
private String password;
public User() {
}
public User(int staffId, String designation, String fname, String lname, String address,
		String phone, String email, String username, String password, int userId) {
	super();
	this.userId = userId;
	this.designation = designation;
	this.fname = fname;
	this.lname = lname;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.username = username;
	this.password = password;
}

public int getUserId() {
	return userId;
}
public void setUserId(int staffId) {
	this.userId = staffId;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", designation=" + designation + ", fname=" + fname + ", lname=" + lname
			+ ", phone=" + phone + ", email=" + email + ", username=" + username + ", password=" + password + "]";
}
}
