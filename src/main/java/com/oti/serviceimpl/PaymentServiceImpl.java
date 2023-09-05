package com.oti.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.undo.CannotUndoException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oti.dto.PaymentDto;
import com.oti.entity.Payment;
import com.oti.exceptions.CustomerIdNotFoundException;
import com.oti.exceptions.PaymentNotFoundException;
import com.oti.exceptions.PolicyIdNotFoundException;
import com.oti.repository.PaymentRepository;
import com.oti.services.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<PaymentDto> getAllPayment()  {
		List<Payment> payments=paymentRepository.findAll();
		List<PaymentDto> d=new ArrayList<>();
		for(Payment p:payments ) {
			PaymentDto pp=new PaymentDto();
			BeanUtils.copyProperties(p, pp);
			d.add(pp);	
		}
		return d;
		
	}

	@Override
	public PaymentDto addPayment(PaymentDto paymentDto) throws PaymentNotFoundException {
		Optional<Payment> payments=paymentRepository.findById(paymentDto.getPaymentId());
		if(payments.isPresent()) {
			throw new PaymentNotFoundException("Payment Id already exists");
		}
		else {
			Payment pp=new Payment();
			BeanUtils.copyProperties(paymentDto, pp);
			paymentRepository.save(pp);	
			return paymentDto;
		}
		
	}

	@Override
	public PaymentDto updatePayment(PaymentDto paymentDto) throws PaymentNotFoundException {
		Optional<Payment> payments=paymentRepository.findById(paymentDto.getPaymentId());
		if(payments.isPresent()) {
			Payment d=new Payment();
			BeanUtils.copyProperties(paymentDto, d);
			paymentRepository.save(d);	
		}
		return paymentDto;
	}

	@Override
	public PaymentDto deletePayment(int paymentId) throws PaymentNotFoundException {
	    if(paymentRepository.existsById(paymentId)) {
	    	Payment p=paymentRepository.findById(paymentId).get();
	    	paymentRepository.deleteById(paymentId);
	    	PaymentDto d=new PaymentDto();
	    	BeanUtils.copyProperties(p, d);
	    	return d;
	    	
	    }
	    else {
	    	throw new PaymentNotFoundException("payment not found with id"+" "+paymentId);
	    }
	}

	@Override
	public List<Payment> getPaymentsBycustomerId(int customerId) throws CustomerIdNotFoundException{
		List<Payment> payments=paymentRepository.findAll();
		List<Payment> d=new ArrayList<>();
		if(payments.isEmpty()) {
			throw new CustomerIdNotFoundException("customer have no payments");	
		}
		else {
			
			for(Payment p:payments) {
				if(p.getCustomerId()==customerId) {
					d.add(p);
					
				}
				
			}
			return d;
			
		}
	}

	@Override
	public List<Payment> getPaymentsByPolicyId(int policyid) throws PolicyIdNotFoundException{
		List<Payment> payments=paymentRepository.findAll();
		List<Payment> d=new ArrayList<>();
		for(Payment p:payments) {
			if(p.getPolicyId()==policyid) {
				d.add(p);
				
			}
			
		}
		return d;
		
		
	}

	@Override
	public Payment findPaymentById(int paymentId) throws PaymentNotFoundException {
		if(paymentRepository.existsById(paymentId)) {
			Payment p=paymentRepository.findById(paymentId).get();
			
			return p;
			
		}
		else {
			throw new PaymentNotFoundException("payment with"+" "+paymentId+" "+"not found");
		}
	}

}
