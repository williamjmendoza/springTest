package com.will.webProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController
{
	@RequestMapping(name="/test")
	public String test()
	{
		System.out.printf("Hola desde Spring%n");
		
		return "Hola";
	}
}
