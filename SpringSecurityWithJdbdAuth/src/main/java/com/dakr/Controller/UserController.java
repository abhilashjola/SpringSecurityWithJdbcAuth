package com.dakr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.Entity.UserEntity;
import com.dakr.Service.UserServiceImp;

@RestController
public class UserController {

	@Autowired
	private UserServiceImp ser;
	@PostMapping("/save")
	public UserEntity insert(UserEntity ue1) {
		
		ser.saveDtls(ue1);
		return ue1;
	}
}
