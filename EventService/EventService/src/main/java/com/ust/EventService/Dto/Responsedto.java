package com.ust.EventService.Dto;


import reactor.core.publisher.Flux;

public class Responsedto {
     private Eventdto eventdto;
    private Flux<Employeedto> employeedto;
    public Responsedto() {
    }
    public Eventdto getEventdto() {
        return eventdto;
    }
    public void setEventdto(Eventdto eventdto) {
        this.eventdto = eventdto;
    }
    public Flux<Employeedto> getEmployeedto() {
        return employeedto;
    }
    public void setEmployeedto(Flux<Employeedto> employeedto) {
        this.employeedto = employeedto;
    }
    public Responsedto(Eventdto eventdto, Flux<Employeedto> employeedto) {
        this.eventdto = eventdto;
        this.employeedto = employeedto;
    }
    
}
