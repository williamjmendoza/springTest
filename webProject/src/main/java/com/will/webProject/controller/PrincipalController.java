package com.will.webProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController
{
	@Autowired
	@Value(value = "${specific.variable.test}")
	String specificVariableTest;
	
	@RequestMapping(name="/test")
	public String test()
	{
		System.out.printf("Hola desde Spring%n");
		System.out.printf("specificVariableTest: %s%n", specificVariableTest);
		
		return "Hola";
	}
}
