package com.terabits.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestforPostman {
	
	@RequestMapping(value="/postman")
	public void postman(@RequestParam ("name") String name) {
		System.out.println(name);
		
	}
	
	@RequestMapping(value="/postman2")
	@ResponseBody
	public String postman2(@RequestParam ("user") String user) {
		
		return user+"  user111";
	}
	
	@RequestMapping(value="/postman3")
	@ResponseBody
	public void postman3(@RequestParam("worker") String worker, HttpServletResponse response)throws Exception {
		response.getWriter().println(worker);
		//return worker;
	}

}
