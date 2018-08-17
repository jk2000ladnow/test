package com.jason.webService;

import javax.xml.ws.Endpoint;

public class CalPub {

	public static void main(String[] args) {

		String url = "http://localhost:1234/cal";
		String url2 = "http://localhost:1234/date";

		Endpoint.publish(url, new Cal());
		Endpoint.publish(url2, new SystemDate());

		System.out.println("Calculator Service published, url: " + url);

	}

}
