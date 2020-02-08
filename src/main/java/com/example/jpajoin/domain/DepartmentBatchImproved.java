package com.example.jpajoin.domain;

import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "department")
public class DepartmentBatchImproved extends AbstractDepartment {

    @BatchSize(size = 100)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private List<Employee> employees = new ArrayList<>();

}
