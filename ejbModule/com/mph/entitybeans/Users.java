package com.mph.entitybeans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable {
	private int userID;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private int userType;
		// userType : 	0 = student (DEFAULT)
		// 				1 = professor
		//				2 = admin
	private String email;
	private Date dob;
	private int invitation;
		// refer to teamID that this user being invited to
		// means that user accepts only 1 invitation at a time
	
	@Id
	@GeneratedValue
	@Column(name="userID")
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	@Column(name="username")
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="password")
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="firstname")
	public String getFirstname(){
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="lastname")
	public String getLastname(){
		return lastname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	
	@Column(name="userType")
	public int getUserType(){
		return userType;
	}
	
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	@Column(name="email")
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="dob")
	public Date getDob(){
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(name="invitation")
	public int getInvitation(){
		return invitation;
	}
	
	public void setInvitation(int invitation) {
		this.invitation = invitation;
	}
}
