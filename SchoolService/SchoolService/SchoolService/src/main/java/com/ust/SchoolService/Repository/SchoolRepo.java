package com.ust.SchoolService.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ust.SchoolService.Entity.School;

public interface SchoolRepo extends ReactiveMongoRepository<School, String> {
    
}
