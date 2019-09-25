package com.nanosoftz.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nanosoftz.springrest.mysql.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
