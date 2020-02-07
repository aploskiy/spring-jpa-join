package com.example.jpajoin.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
@NamedEntityGraph(name = "joinAll", includeAllAttributes = true)
public class User {

    @Id
    private Integer id;
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
