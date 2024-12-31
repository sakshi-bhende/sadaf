package com.cdac.usermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.usermicroservice.dto.UsersDto;
import com.cdac.usermicroservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{username}")
	public UsersDto getByUsername(@PathVariable("username")String name) {
		return userService.getUserDetails(name);
		
	}
	
	@GetMapping("/")
	public List<UsersDto> getAllUsers() {
		return userService.allUsers();
		
	}
}
