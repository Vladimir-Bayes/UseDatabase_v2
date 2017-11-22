package com.terabits.controller;

import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestHello {
	@RequestMapping(value="/testHello")
	@ResponseBody
	public String testHello(@RequestParam("name") String name,HttpServletResponse response)throws Exception {
		System.out.println(name);
		//response.getWriter().println(name);
		return name+"hello";
	}
}
