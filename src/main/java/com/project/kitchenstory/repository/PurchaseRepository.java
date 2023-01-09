package com.project.kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.kitchenstory.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}