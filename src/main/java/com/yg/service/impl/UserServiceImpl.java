package com.yg.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.dao.UserDao;
import com.yg.pojo.User;
import com.yg.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}


	public int userRegister(User user) {
				//ҵ������ȫ����
				user.setRole(2);
				Date nowDate = new Date();
				user.setRegtime(nowDate);
				user.setUpdatetime(nowDate);
				user.setUserstatus(0);
				//����dao����в�������
				int result = userDao.insertUser(user);
				return result;
		
	}

	
	
	
	

}
