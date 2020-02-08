package com.example.jpajoin.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedEntityGraph(name = "User.joinAll", includeAllAttributes = true)
public class User {

    @Id
    private Integer id;
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
