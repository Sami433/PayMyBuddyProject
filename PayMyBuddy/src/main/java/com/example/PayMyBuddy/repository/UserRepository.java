package com.example.PayMyBuddy.repository;

import com.example.PayMyBuddy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public Optional<User> findByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.id = ?1")
    public User findById(int id);

}


