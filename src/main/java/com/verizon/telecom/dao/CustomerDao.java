package com.verizon.telecom.dao;

import java.util.List;	

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.telecom.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
	boolean existsByCustomerMobileNumber(String customerMobileNumber);

	boolean existsByEmailId(String emailId);

	Customer findByCustomerMobileNumber(String mobileNumber);

	Customer findByEmailId(String emailId);

	List<Customer> findAllByCustomerLastName(String lastName);
}
