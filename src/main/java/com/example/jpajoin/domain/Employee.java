package com.example.jpajoin.domain;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "Employee")
public class Employee {

    @Id
    private Integer id;
    @NaturalId
    private String name;

}
