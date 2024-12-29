package com.ust.EmployeeService.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EmployeeService.Entity.Employee;
import com.ust.EmployeeService.Repository.EmployeeRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repository;
    public EmployeeService(EmployeeRepo repository) {
        this.repository = repository;
    }

    public Mono<Employee> save(Employee employee){
        return repository.save(employee);
    }

    public Flux<Employee> getAllEmployee(){
        return repository.findAll();
    }
    public Flux<Employee> getemployee(String eventid) {
        return repository.findByEventno(eventid);    
    }

}