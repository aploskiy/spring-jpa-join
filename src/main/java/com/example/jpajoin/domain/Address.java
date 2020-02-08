package com.example.jpajoin.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    private Integer id;
    @Column
    private String country;
    @Column
    private String city;
    @Column
    private String street;

}
