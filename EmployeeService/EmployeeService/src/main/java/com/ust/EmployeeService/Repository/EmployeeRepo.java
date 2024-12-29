package com.ust.EmployeeService.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ust.EmployeeService.Entity.Employee;

import reactor.core.publisher.Flux;

public interface EmployeeRepo extends ReactiveMongoRepository<Employee, String>{

    Flux<Employee> findByEventno(String eventid); 
}
