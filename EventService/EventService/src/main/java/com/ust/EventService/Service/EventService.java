package com.ust.EventService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.ust.EventService.Dto.Employeedto;
import com.ust.EventService.Dto.Eventdto;
import com.ust.EventService.Dto.Responsedto;
import com.ust.EventService.Entity.Event;
import com.ust.EventService.Repository.EventRepo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    @Autowired EventRepo repository;

    @Autowired WebClient webclient;


    public Mono<Event> addEvent(Event event){
        return repository.save(event);
    }

    public Flux<Event> getallEvent(){
        return repository.findAll();
    }
    @CircuitBreaker(name = "EventService", fallbackMethod = "fallbackGetSchool")
    public Responsedto getSchool(String eventno) {
        Responsedto responseDto = new Responsedto();
        Event event = repository.findByEventId(eventno).orElseThrow(() -> new RuntimeException("School not found"));
        Eventdto eventdto = mapToEventdto(event);

        Flux<Employeedto> employeedtolist =  webclient.get()
                .uri("http://localhost:8081/employee/" + event.getEventno())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Flux<Employeedto>>() {})
                .block();
            
                responseDto.setEventdto(eventdto);
                responseDto.setEmployeedto(employeedtolist);
        
                return responseDto;
            }
            public Responsedto fallbackGetSchool(long eventId, Throwable throwable) {
                // Handle the fallback logic, e.g., return a default response or log the error
                return new Responsedto(); // Return an empty response or a default response
            }
            private Eventdto mapToEventdto(Event event) {
                Eventdto eventdto = new Eventdto();
                eventdto.setEventId(event.getEventId());
                eventdto.setDate(event.getDate());
                eventdto.setEventname(event.getEventname());
                eventdto.setEventno(event.getEventno());
                return eventdto;
            }
        
                
}

