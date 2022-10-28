package com.springmvc.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.boot.dao.UserRepository;
import com.springmvc.boot.model.UserTable;

@RestController
public class UserRestController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("user")
	public String saveUser(@RequestBody UserTable user) {
		userRepository.save(user);
		return "User saved";
	}
	
	@GetMapping("users")
	public List<UserTable> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("user/{id}")
	public Optional<UserTable> getUserById(@PathVariable("id") String id){
		return userRepository.findById(Integer.parseInt(id));
	}
	
}
