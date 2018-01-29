package com.pixelweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Feedback {
	
	private String name;
	@Id
	private String email;
	private int mobile;
	private String subject;
	private String message;
	
	public Feedback() {	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", mobile=" + mobile + ", subject=" + subject
				+ ", message=" + message + "]";
	}
	

}
