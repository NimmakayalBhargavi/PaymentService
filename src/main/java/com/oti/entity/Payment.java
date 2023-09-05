package com.oti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Payment {
	@Id
	@NotNull(message = "payment id cannot be null")
	private int paymentId;
	private Date paymentDate;
	@NotBlank(message = "payment status cannot be blank")
	private String paymentStatus;
	@NotNull(message = "amountpaid ")
	private int amountPaid;
	@NotNull(message = "customerId cannot be null")
	private int customerId;
	@NotNull(message = "policy id cannot be null")
	private int policyId;
	
	
	
	public Payment(int paymentId, int amountPaid, int policyId, int customerId, String paymentStatus, Date paymentDate) {
		super();
		this.paymentId = paymentId;
		this.amountPaid = amountPaid;
		this.policyId = policyId;
		this.customerId = customerId;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
	}
	public Payment() {
		super();
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

}
