package com.cdac.usermicroservice.service;

import java.util.List;

import com.cdac.usermicroservice.dto.UsersDto;

public interface UserService {
	public UsersDto getUserDetails(String userName);
	public List<UsersDto> allUsers();

}
