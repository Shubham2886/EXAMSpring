package com.iit.edu.SpringBootReg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iit.edu.SpringBootReg.register.Register;

@Repository
public class DAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
public void saveUsingJDBCTemplate(Register reg) {
		
		jdbcTemplate.update("insert into register values(?, ?, ?, ?, ?, ?)", 
					new Object[] {reg.getName(), reg.getEmailId(), reg.getMobileNo(),
							reg.getAddress(),reg.getPassword(),reg.getConPass()}
				);
		
	}

}
