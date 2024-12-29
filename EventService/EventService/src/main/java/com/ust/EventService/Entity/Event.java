package com.ust.EventService.Entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Event {
    @Id
    public long eventId;
    public String eventname;
    public String date;
    public String eventno;
    public Event() {
    }
    public Event(long eventId, String eventname, String date) {
        this.eventId = eventId;
        this.eventname = eventname;
        this.date = date;
    }
    
}
