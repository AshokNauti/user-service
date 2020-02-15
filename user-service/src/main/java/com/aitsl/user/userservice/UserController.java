package com.aitsl.user.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	//@Autowired
	//private Environment environment;
	
	@Autowired
	private UserDetailRepository userDetailRepository;
	
	@GetMapping("users/{id}")
	public Optional<UserDetail> getUserInfo(@PathVariable long id) {
		
		return userDetailRepository.findById(id);
	}
	
	@GetMapping("users")
	public List<UserDetail> getUsers() {
		
		return userDetailRepository.findAll();
	}
}
