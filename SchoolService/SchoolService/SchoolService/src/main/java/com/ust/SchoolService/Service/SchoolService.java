package com.ust.SchoolService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.SchoolService.Entity.School;
import com.ust.SchoolService.Repository.SchoolRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SchoolService {
    @Autowired
    SchoolRepo repository;

    public SchoolService(SchoolRepo repository){
        this.repository=repository;
    }

    public Mono<School> save(School school){
        return repository.save(school);
    }

    public Flux<School> getAllSchool(){
        return repository.findAll();
    }
    public Mono<School> getschool(String sid){
        return repository.findById(sid);
    }
}
