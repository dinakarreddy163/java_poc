package com.example.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Login;
import com.example.employee.repository.LoginRepository;


@RestController
public class logincontroller {

	  private LoginRepository login;
	  
	  @GetMapping("/login")
		public String viewHomePage() {
		  Login log =  login.findAllById(100);
		  System.out.println(log);
			return "ok";
		}
}
