package com.figura.accounts.repository;

import com.figura.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //findBy must be declared as 'findBy' to trigger JPA
    //mobileNumber reflects directly to Customer 'mobileNumber' parameter
    //this will trigger JPA - we don't have to write logic for this interface method!!!
    Optional<Customer> findByMobileNumber(String mobileNumber);

}
