package com.springbootrestapi.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.entity.User;
import com.springbootrestapi.repository.UserRepository;



@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	 UserRepository userRepo;
	
	@GetMapping("/user")
	public List<User> get(){
		return userRepo.findAll();
	}
	
	@PostMapping("/user")
	public User save(@RequestBody User userObj) {
		return userRepo.save(userObj);
	}
	
	@GetMapping("/user/{id}")
	public User get(@PathVariable int id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}else {
			throw new RuntimeException("User not found for the id "+id);
		}
	}
	
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			userRepo.delete(user.get());
			return "User is deleted with id "+id;
		}else {
			throw new RuntimeException("User not found for the id "+id);
		}
	}
	
	@PutMapping("/user")
	public User update(@RequestBody User userObj) {
		return userRepo.save(userObj);
	}

}
