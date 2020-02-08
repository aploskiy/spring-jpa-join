package com.example.jpajoin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "department")
public class DepartmentOriginal extends AbstractDepartment {

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private List<Employee> employees = new ArrayList<>();

}
