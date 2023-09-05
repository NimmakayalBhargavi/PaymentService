package com.oti.dto;

import java.util.Date;

public class PaymentDto {
	private int paymentId;
	private Date paymentDate;
	private String paymentStatus;
	private int amountPaid;
	private int customerId;
	private int policyId;
	public PaymentDto() {
		super();
	}
	public PaymentDto(int paymentId, int amountPaid, int policyId, String paymentStatus, Date paymentDate,
			int customerId) {
		super();
		this.paymentId = paymentId;
		this.amountPaid = amountPaid;
		this.policyId = policyId;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
		this.customerId = customerId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

}
