package com.example.s_boot.JPATestH2.repository;

import java.util.List;

import com.example.s_boot.JPATestH2.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
