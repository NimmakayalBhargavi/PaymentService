package com.oti.dto;

public class AdminDto {
	private int adminId;
	private String email;
	private int userId;
	public AdminDto() {
		super();
	}
	public AdminDto(int adminId, String email, int userId) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.userId = userId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "AdminDto [adminId=" + adminId + ", email=" + email + ", userId=" + userId + "]";
	}
	
	

}
