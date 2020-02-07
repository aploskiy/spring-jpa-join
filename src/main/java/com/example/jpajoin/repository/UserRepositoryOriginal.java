package com.example.jpajoin.repository;

import com.example.jpajoin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryOriginal extends JpaRepository<User, Integer> {

}
