package com.project.kitchenstory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.kitchenstory.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User>findUserByEmail(String email);
}
