package com.estudo.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.estudo.jpa.model.User;
import com.estudo.jpa.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		User user = new User();
		
		user.setEmail("iarlen@g.com");
		user.setNome("Iarlen");
		
		userRepository.save(user);
	}

}
