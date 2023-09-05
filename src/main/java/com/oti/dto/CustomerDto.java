package com.oti.dto;

import java.time.LocalDate;


public class CustomerDto {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private Long contactNo;
	private LocalDate dob;
	private String gender;
	private String employment;
	private double income;
//	private AddressDto addressDto;
//	private PolicyDto policyDto;
	//private int userId;
	//private Policy policy;
	//private int paymentId;
	
	public CustomerDto() {
		super();
	}
	public CustomerDto(int customerId, String firstName, String lastName, String email, Long contactNo, LocalDate dob,
			String gender, String employment, double income, AddressDto addressDto, PolicyDto policyDto) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
		this.gender = gender;
		this.employment = employment;
//		this.income = income;
//		this.addressDto = addressDto;
//		this.policyDto = policyDto;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
//	public AddressDto getAddressDto() {
//		return addressDto;
//	}
//	public void setAddressDto(AddressDto addressDto) {
//		this.addressDto = addressDto;
//	}
//	public PolicyDto getPolicyDto() {
//		return policyDto;
//	}
//	public void setPolicyDto(PolicyDto policyDto) {
//		this.policyDto = policyDto;
//	}
	

}
