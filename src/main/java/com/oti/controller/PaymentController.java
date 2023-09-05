package com.oti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oti.dto.PaymentDto;
import com.oti.entity.Payment;
import com.oti.exceptions.PaymentNotFoundException;
import com.oti.services.PaymentService;

@RestController
@RequestMapping("/payments")
@CrossOrigin("*")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentServcie;
	
	
	@GetMapping("/allpayments")
	public ResponseEntity<List<PaymentDto>>  getAllPayment() throws PaymentNotFoundException {
		
		return new ResponseEntity<>(paymentServcie.getAllPayment(),HttpStatus.OK);
	}
	

	@PostMapping("/addpayment")
	public ResponseEntity<PaymentDto>  addPayment(@RequestBody PaymentDto paymentDto) throws PaymentNotFoundException {
		
		return new ResponseEntity<>(paymentServcie.addPayment(paymentDto),HttpStatus.CREATED);
	}

	@PutMapping("/updatepayment")
	public ResponseEntity<PaymentDto>  updatePayment(@RequestBody PaymentDto paymentDto) throws PaymentNotFoundException {
		return new ResponseEntity<>(paymentServcie.updatePayment(paymentDto),HttpStatus.ACCEPTED);
	}
	

    @DeleteMapping("deletepayment/{paymentId}")
	public ResponseEntity<PaymentDto>  deletePayment(@PathVariable int paymentId) throws PaymentNotFoundException {
		
		return new ResponseEntity<>(paymentServcie.deletePayment(paymentId),HttpStatus.ACCEPTED);
	}
    

    @GetMapping("/getpaymentbycustomerid/{customerId}")
	public ResponseEntity<List<Payment>> getPaymentsBycustomerId(@PathVariable int customerId) {
		
	    return new ResponseEntity<>(paymentServcie.getPaymentsBycustomerId(customerId),HttpStatus.OK);
	}

	@GetMapping("/getpaymentbypolicyid/{policyid}")
	public ResponseEntity<List<Payment>>  getPaymentsByPolicyId(@PathVariable int policyid) {
		return new ResponseEntity<>(paymentServcie.getPaymentsByPolicyId(policyid),HttpStatus.OK);
	}
	@GetMapping("getpaymentbyid/{paymentId}")
	public ResponseEntity<Payment> findpaymentById(@PathVariable int paymentId)throws PaymentNotFoundException{
		return new ResponseEntity<>(paymentServcie.findPaymentById(paymentId),HttpStatus.OK);
	}

}
