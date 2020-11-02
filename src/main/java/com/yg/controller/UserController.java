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
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/registerUser",method = RequestMethod.POST)
	public String registerUser(User user,Map<String,Object> map){
		//参数校验
		System.out.println("用户名唯一。密码格式。Mobile格式。Email格式");
		//调用Service层进行业务处理
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
