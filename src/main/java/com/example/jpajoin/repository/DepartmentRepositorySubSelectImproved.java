package com.example.jpajoin.repository;

import com.example.jpajoin.domain.DepartmentSubSelectImproved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositorySubSelectImproved extends JpaRepository<DepartmentSubSelectImproved, Integer> {
}
