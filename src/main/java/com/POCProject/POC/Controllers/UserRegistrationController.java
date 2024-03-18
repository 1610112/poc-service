package com.POCProject.POC.Controllers;

import com.POCProject.POC.Models.User;
import com.POCProject.POC.Services.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserRegistrationController {


    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("/Register")
    public void UserRegistration(@RequestBody Map<String,Object> requestBody){
        userRegistrationService.registerUser((String) requestBody.get("name"),(Integer) requestBody.get("number"));


    }
    @GetMapping("/getUser")
    public User getUser(@RequestBody Map<String,Object> requestBody){
        return userRegistrationService.getUser((Integer) requestBody.get("id"));

    }
}
