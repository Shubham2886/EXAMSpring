package com.iit.edu.SpringBootReg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iit.edu.SpringBootReg.register.Register;
import com.iit.edu.SpringBootReg.service.RegService;

@RestController
@RequestMapping("/register")
public class RegController {
	
	@Autowired
	private RegService regService;

	@PostMapping
	@RequestMapping(value = "saveUser", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Register> saveEmp(@RequestBody Register reg){
		
		regService.saveUsingJdbc(reg);
		
		return new ResponseEntity<Register>(reg, HttpStatus.OK);
		
		
	}
}
