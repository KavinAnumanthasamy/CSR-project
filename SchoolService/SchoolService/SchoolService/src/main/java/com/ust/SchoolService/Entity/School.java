package com.ust.SchoolService.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class School {
    @Id
    public String sid;
    public String sname;
    public String saddress; 
    public String slocation;
    
}
