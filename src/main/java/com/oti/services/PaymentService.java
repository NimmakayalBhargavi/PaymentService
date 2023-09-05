package com.oti.services;

import java.util.List;

import com.oti.dto.PaymentDto;
import com.oti.entity.Payment;
import com.oti.exceptions.CustomerIdNotFoundException;
import com.oti.exceptions.PaymentNotFoundException;
import com.oti.exceptions.PolicyIdNotFoundException;

public interface PaymentService {
	public List<PaymentDto> getAllPayment()throws PaymentNotFoundException;
	public PaymentDto addPayment(PaymentDto paymentDto)throws PaymentNotFoundException;
	public PaymentDto updatePayment(PaymentDto paymentDto)throws PaymentNotFoundException;
	public PaymentDto deletePayment(int paymentId)throws PaymentNotFoundException;
	public Payment findPaymentById(int paymentId)throws PaymentNotFoundException;
	public List<Payment> getPaymentsBycustomerId(int customerId)throws CustomerIdNotFoundException;
	public List<Payment> getPaymentsByPolicyId(int policyid)throws PolicyIdNotFoundException;

}
