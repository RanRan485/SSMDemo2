package com.yg.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yg.pojo.User;
import com.yg.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("UserController");
		
	}
	/**
	 * �û�ע��
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/registerUser",method = RequestMethod.POST)
	public String registerUser(User user,Map<String,Object> map){
		//����У��
		System.out.println("�û���Ψһ�������ʽ��Mobile��ʽ��Email��ʽ");
		//����Service�����ҵ����
		 int result = userService.userRegister(user);
		 if(result!=1){
			 map.put("code", "500");
			 map.put("message", "fail");
			 return "registerUser";
		 }
		 map.put("code", "200");
		 map.put("message", "success"); 
		return "index";
		
	}
	

}
