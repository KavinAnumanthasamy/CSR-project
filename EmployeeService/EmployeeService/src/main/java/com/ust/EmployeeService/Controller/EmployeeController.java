package com.ust.EmployeeService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeeService.Entity.Employee;
import com.ust.EmployeeService.Service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    public EmployeeController(EmployeeService service){
        this.service=service;
    }

    @PostMapping("/addemployee")
    public Mono<Employee>addEmployee(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping("/getallemployee")
    public Flux <Employee> getAllEmployee(){
        return service.getAllEmployee();
    }
    
    @GetMapping("/{eventid}")
    public Flux<Employee> getemployee(@PathVariable("eventid") String eventid) {
        return service.getemployee(eventid);
    }

}
