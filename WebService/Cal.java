package com.jason.webService;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService

public class Cal {
	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}
	
	@WebMethod
	public String show() {
		return "Show Time";
	}
}
