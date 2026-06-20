package com.example.userdemo;





import org.springframework.stereotype.Service;

import java.util.*;



@Service

public class UserService {

   private UserRepository userRepository;

   

   public UserService(UserRepository userRepository) {

	   this.userRepository = userRepository;

   }

   

   public void save(User user) {

	   userRepository.save(user);

   }

   

   public Optional<User> find(int id) {

	   return userRepository.findById(id);

   }

   

   public List<User> findAll(){

	   return userRepository.findAll();

   }

   

   

}