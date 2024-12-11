package com.example.VehicalRentalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VehicalRentalManagment.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
}
