package com.ust.EventService.Dto;

public class Eventdto {
    public long eventId;
    public String eventname;
    public String date;
    public String eventno;
  

    public Eventdto(String eventno) {
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
    public String getEventname() {
        return eventname;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Eventdto(long eventId, String eventname, String date) {
        this.eventId = eventId;
        this.eventname = eventname;
        this.date = date;
    }
    public Eventdto() {
    }
    
}
