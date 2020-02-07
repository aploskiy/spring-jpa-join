package com.example.jpajoin.domain;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @OneToOne(optional = true)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "address_id")
    private Address address;

}
