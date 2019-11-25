package com.example.demo.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@GetMapping("/test")
	public String test(HttpServletRequest request) {
		System.out.println("----------------header----------------");
		Enumeration<?> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			System.out.println(key + ": " + request.getHeader(key));
		}
		System.out.println("----------------header----------------");
		return "hellooooooooooooooo!";
	}

}
