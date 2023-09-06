package com.dakr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.Entity.UserEntity;
import com.dakr.Repository.UserRepository;
@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository repo;
	public UserEntity saveDtls(UserEntity ue) {
		repo.save(ue);
		
		return ue;
	}

}
