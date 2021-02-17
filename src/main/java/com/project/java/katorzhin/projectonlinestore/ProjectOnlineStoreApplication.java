package com.project.java.katorzhin.projectonlinestore;

import com.project.java.katorzhin.projectonlinestore.entity.UserEntity;
import com.project.java.katorzhin.projectonlinestore.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ProjectOnlineStoreApplication {

//	@Autowired
//	private UserEntityRepository userEntityRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectOnlineStoreApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void testRepository() {
//		UserEntity userEntity = new UserEntity();
//		userEntity.setAddress("address");
//		userEntity.setName("name");
//		userEntity.setPhone("phone");
//		userEntity.setEmail("email");
//		userEntityRepository.save(userEntity);
//	}
}
