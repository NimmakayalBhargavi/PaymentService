package com.oti.dto;

public class PolicyDto {
	private int policyId;
	private String policyName;
	private double totalAmount;
	private double termAmount;
	private double income;
	private double claimingAmount;
	public PolicyDto() {
		super();
	}
	public PolicyDto(int policyId, String policyName, double totalAmount, double termAmount, double income,
			double claimingAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.totalAmount = totalAmount;
		this.termAmount = termAmount;
		this.income = income;
		this.claimingAmount = claimingAmount;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getTermAmount() {
		return termAmount;
	}
	public void setTermAmount(double termAmount) {
		this.termAmount = termAmount;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getClaimingAmount() {
		return claimingAmount;
	}
	public void setClaimingAmount(double claimingAmount) {
		this.claimingAmount = claimingAmount;
	}
	@Override
	public String toString() {
		return "PolicyDto [policyId=" + policyId + ", policyName=" + policyName + ", totalAmount=" + totalAmount
				+ ", termAmount=" + termAmount + ", income=" + income + ", claimingAmount=" + claimingAmount + "]";
	} 
	

}
