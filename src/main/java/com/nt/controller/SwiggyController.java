package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SwiggyController {

	@Value("${dbuser}")
	private String user;
	
	@Value("${dbpassword}")
	private String pass;
	
	@GetMapping("/show")
	public ResponseEntity<?> showItems(){
		return new ResponseEntity<String>(user + " Order From Swiggy"+ "From "+ pass,HttpStatus.OK);
	}
	
	@GetMapping("/details")
	public ResponseEntity<?>showOrders(){
		return new ResponseEntity<String>(user + "from custormers",HttpStatus.OK);
	}
	
	
}
