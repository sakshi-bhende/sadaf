package com.cdac.usermicroservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.usermicroservice.dto.UsersDto;
import com.cdac.usermicroservice.entity.Users;
import com.cdac.usermicroservice.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	@Override
	public UsersDto getUserDetails(String userName) {
		Optional<Users> user  =  userRepository.findById(userName);
		if(user.isPresent()) {
			UsersDto dto = new UsersDto();
			BeanUtils.copyProperties(user.get(), dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<UsersDto> allUsers() {
		// TODO Auto-generated method stub
		List<Users> list = userRepository.findAll();
		List<UsersDto> finalList = new ArrayList<UsersDto>();
		for(Users user : list) {
			UsersDto dto = new UsersDto();
			BeanUtils.copyProperties(user, dto);
			finalList.add(dto);
		}
		return finalList;
	}

}
