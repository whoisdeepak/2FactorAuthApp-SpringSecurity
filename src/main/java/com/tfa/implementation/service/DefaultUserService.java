package com.tfa.implementation.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tfa.implementation.dto.UserRegisteredDTO;
import com.tfa.implementation.model.User;


public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);

	String generateOtp(User user);



	
}
