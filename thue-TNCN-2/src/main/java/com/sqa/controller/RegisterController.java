package com.sqa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sqa.models.dtos.NguoinopthueDTO;
import com.sqa.models.dtos.RegisterModel;
import com.sqa.models.entities.Nguoinopthue;
import com.sqa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class RegisterController {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public String RegisterStep0(Model model){
    	
        model.addAttribute("registerModel", new RegisterModel());
        return "./HomeViews/register";
    }
    @GetMapping("/api/getUserByMST")
    public ResponseEntity<String> getUserByMST(@RequestParam("masothue") String masothue){
        Nguoinopthue tmp = userService.getByMasothue(masothue);
        ObjectMapper objectMapper = new ObjectMapper();
        String json;
        try{
            json = objectMapper.writeValueAsString(userService.convertToDto(tmp));
        }
        catch (JsonProcessingException e){
            return new ResponseEntity<>("error converting object to Json", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(json);
//        return userService.convertToDto(tmp);
    }
//    @GetMapping("/register2")
//    public String RegisterStep2(Model model){
//        model.addAttribute("user", new NguoinopthueDTO());
//        return "./HomeViews/register2";
//    }

}
