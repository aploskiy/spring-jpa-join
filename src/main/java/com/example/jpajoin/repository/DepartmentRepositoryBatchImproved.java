package com.example.jpajoin.repository;

import com.example.jpajoin.domain.DepartmentBatchImproved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryBatchImproved extends JpaRepository<DepartmentBatchImproved, Integer> {
}
