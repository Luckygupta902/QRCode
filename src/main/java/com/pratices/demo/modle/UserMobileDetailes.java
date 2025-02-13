package com.pratices.demo.modle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class UserMobileDetailes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String userName;
    String userPhoneName;
    String email;
    String phone;
    @Lob // Used to store binary data (QR code image)
    private byte[] qrCode;
    int numberOfPhone;
    boolean status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneName() {
		return userPhoneName;
	}
	public void setUserPhoneName(String userPhoneName) {
		this.userPhoneName = userPhoneName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public byte[] getQrCode() {
		return qrCode;
	}
	public void setQrCode(byte[] qrCode) {
		this.qrCode = qrCode;
	}
	public int getNumberOfPhone() {
		return numberOfPhone;
	}
	public void setNumberOfPhone(int numberOfPhone) {
		this.numberOfPhone = numberOfPhone;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
    
    
    
	
}
