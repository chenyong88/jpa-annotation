package co.its.leishen.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.its.leishen.jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
