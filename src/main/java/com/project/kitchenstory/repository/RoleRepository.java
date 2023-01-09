package com.project.kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.kitchenstory.model.Role;



public interface RoleRepository extends JpaRepository<Role, Integer> {

	
}

