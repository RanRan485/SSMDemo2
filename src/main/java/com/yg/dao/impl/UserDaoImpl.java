package com.yg.dao.impl;





import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yg.dao.UserDao;
import com.yg.pojo.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl() {
		System.out.println("UserDaoImpl");
	}


	public int insertUser(User user) {
		String sql = "insert into t_user (username,password,role,mobile,email,regtime) values (?,?,?,?,?,?);";
		String username = user.getUsername();
		String password = user.getPassword();
		int role = user.getRole();
		String mobile = user.getMobile();
		String email = user.getEmail();
		Date regtime = user.getRegtime();
		Object[] args = { username, password, role, mobile, email, regtime };
		int result = jdbcTemplate.update(sql,args);
		return result;
		
		
	}
	
	
	

}
