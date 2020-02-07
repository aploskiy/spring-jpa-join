package com.example.jpajoin.repository;

import com.example.jpajoin.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Override
    @EntityGraph("joinAll")
    List<User> findAll();

}
