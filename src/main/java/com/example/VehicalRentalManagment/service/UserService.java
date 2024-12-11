package com.example.VehicalRentalManagment.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.VehicalRentalManagment.entity.User;
import com.example.VehicalRentalManagment.exception.UserNotFoundByIdException;
import com.example.VehicalRentalManagment.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	public User findUser(int userId) {
		
		return userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundByIdException("User Not Found"));
	}

	public User deleteUSer(int userId) {
		
		Optional<User> optional = userRepository.findById(userId);
		
		if(optional.isPresent()) {
			User user = optional.get();
			userRepository.delete(user);
			return user;
		}else {
			throw new UserNotFoundByIdException("User Not Found");
		}
	}

	
	public User updateUser(User user) {
	Optional<User> optional=	userRepository.findById(user.getUserId());
	if(optional.isPresent()) {
		
		return userRepository.save(user);
	}else {
		throw new UserNotFoundByIdException("User Not Found");
	}
	}

}
