package com.example.VehicalRentalManagment.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.VehicalRentalManagment.entity.User;
import com.example.VehicalRentalManagment.service.UserService;
import com.example.VehicalRentalManagment.util.ResponseStructure;

@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/save-user")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
	 	user =userService.saveUser(user);
	 	return ResponseStructure.create(HttpStatus.CREATED.value(), "User created", user);
	}
	
	@GetMapping("/find-user")
	public User findUser( @RequestParam int userId) {
		return userService.findUser(userId);
	}
	
	
	@DeleteMapping("/delete-user")
	public User deleteUser( @RequestParam int userId) {
		return userService.deleteUSer(userId);
	}
	
	@PutMapping("/update-user")
	public User updateUser(@RequestBody User user) {
		
		return userService.updateUser(user);
	}
}
