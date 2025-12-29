package com.Api.BloggingPlatform.service;

import com.Api.BloggingPlatform.model.UserModel;
import com.Api.BloggingPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<Object> createUser(UserModel userModel) {
        UserModel newAuthor = new UserModel();
        if(userRepository.findByAuthor(userModel.getAuthor()).isPresent()){
            System.out.println("The author already Exist");
            return ResponseEntity.ok("Author Created");
        } else {
            newAuthor.setAuthor(userModel.getAuthor());
            UserModel savedAuthor = userRepository.save(newAuthor);
            if(userRepository.findByAuthor(savedAuthor.getAuthor()).isPresent())
                return ResponseEntity.ok("Author Created");
            else return ResponseEntity.unprocessableEntity().body("Failed create user Specified");
        }
    }
}