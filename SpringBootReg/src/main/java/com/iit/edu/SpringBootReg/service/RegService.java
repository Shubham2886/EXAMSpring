package com.iit.edu.SpringBootReg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iit.edu.SpringBootReg.dao.DAO;
import com.iit.edu.SpringBootReg.register.Register;

@Service
public class RegService {

	@Autowired
	private DAO dao;
	
	public void saveUsingJdbc(Register reg) {
		
		
		dao.saveUsingJDBCTemplate(reg);
	}
}
