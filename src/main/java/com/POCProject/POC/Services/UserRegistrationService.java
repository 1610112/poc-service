package com.POCProject.POC.Services;

import com.POCProject.POC.Models.User;
import com.POCProject.POC.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserRegistrationService {
    @Autowired
    UserRepository userRepository;
    public void registerUser(String name, Integer number){
        User user=new User();
        user.setName(name);
        user.setPhoneNumber(number);
        System.out.println(user.toString());
        userRepository.save(user);
        System.out.println(user.toString());




    }
    public User getUser(Integer id){
        Long newId= (long) id;
        Optional<User> optionalUser=userRepository.findById(newId);
        optionalUser.ifPresent(user -> System.out.println(user.toString()));
        return optionalUser.orElse(new User());

    }
}
