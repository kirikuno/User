package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(@Param("email") String email);
}