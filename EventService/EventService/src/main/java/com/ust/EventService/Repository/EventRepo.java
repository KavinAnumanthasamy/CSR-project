package com.ust.EventService.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.EventService.Entity.Event;
@Repository

public interface EventRepo extends ReactiveMongoRepository<Event, String> {
    Optional<Event> findByEventId(String eventno);  // Use eventId (camelCase) here
}
