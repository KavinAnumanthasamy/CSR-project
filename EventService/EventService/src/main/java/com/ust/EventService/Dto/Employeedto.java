package com.ust.EventService.Dto;

import java.time.LocalDateTime;

public class Employeedto {
    public String id;
    public String name;
    public Long mobilenumber;
    public String designation;
    public String location;
    public LocalDateTime updatedAt;
    public long eventId;
    public String eventno;
    
    
    public Employeedto(String eventno) {
        this.eventno = eventno;
    }
    public String getEventno() {
        return eventno;
    }
    public void setEventno(String eventno) {
        this.eventno = eventno;
    }
    public long getEventId() {
        return eventId;
    }
    public void setEventId(long eventId) {
        this.eventId = eventId;
    }
    public Employeedto() {
    }
    public Employeedto(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getMobilenumber() {
        return mobilenumber;
    }
    public void setMobilenumber(Long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Employeedto(String id, String name, Long mobilenumber, String designation, String location,
            LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.designation = designation;
        this.location = location;
        this.updatedAt = updatedAt;
    }
}
