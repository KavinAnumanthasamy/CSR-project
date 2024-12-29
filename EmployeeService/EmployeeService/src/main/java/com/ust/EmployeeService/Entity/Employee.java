package com.ust.EmployeeService.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    public String id;
    public String name;
    public Long mobilenumber;
    public String designation;
    public String location;
    public LocalDateTime updatedAt;
    public String eventno;

}
