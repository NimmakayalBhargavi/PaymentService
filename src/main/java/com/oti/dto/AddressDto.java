package com.oti.dto;

public class AddressDto {
	private int addressId;
	private String city;
	private String state;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public AddressDto(int addressId, String city, String state) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
	}
	public AddressDto() {
		super();
	}
	@Override
	public String toString() {
		return "AddressDto [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	

}
