package com.paul.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paul.domain.User;
import com.paul.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	   @Resource  
	    private IUserService userService;  
	      
	    @RequestMapping("/showUser")  
	    public String toIndex(HttpServletRequest request,Model model){ 
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        User user = this.userService.getUserById(userId);  
	        model.addAttribute("user", user);
			System.out.println("hahahahha");
			System.out.println("testtest");
			return "showUser";
	    }
	    
	    
	  
	    
}