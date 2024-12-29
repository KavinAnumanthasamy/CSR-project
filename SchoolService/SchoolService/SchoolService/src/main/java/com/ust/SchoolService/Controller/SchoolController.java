package com.ust.SchoolService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.SchoolService.Entity.School;
import com.ust.SchoolService.Service.SchoolService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService service;

    public SchoolController (SchoolService service){
        this.service = service;
    }

    @PostMapping("/addschool")
    public Mono<School> addSchool(@RequestBody School school){
        return service.save(school);
    }

    @GetMapping("/getschool")
    public Flux<School> getAllSchool(){
        return service.getAllSchool();
    }

    @GetMapping("/{sid}")
    public Mono<School> getschoolbyid(@PathVariable String sid){
        return service.getschool(sid);
    }
}
