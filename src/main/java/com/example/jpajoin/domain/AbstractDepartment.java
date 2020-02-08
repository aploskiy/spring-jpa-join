package com.example.jpajoin.domain;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@MappedSuperclass
public class AbstractDepartment {

    @Id
    private Integer id;
    @Column
    private String name;

}
