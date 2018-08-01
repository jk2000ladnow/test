package com.jason.test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nProperties {

	public static void main(String[] args) {
		runMessage("tw","JoJo");
		runMessage("us");
	}
	
	public void runEnUs () {
		Locale local = new Locale("en","US");
		ResourceBundle bundle = ResourceBundle.getBundle("properties.message", local);
		String hello = bundle.getString("jason.hello");
		String good = bundle.getString("jason.good");
		System.out.println(hello);
		System.out.println(good);
	}
	
	public void runZhTw () {
		ResourceBundle bundle = ResourceBundle.getBundle("properties.message");
		String hello = bundle.getString("jason.hello");
		String good = bundle.getString("jason.good");
		MessageFormat helloMf = new MessageFormat(hello);
		MessageFormat goodMf = new MessageFormat(good);
		Object[] obj = {"Jason"};
		System.out.println(helloMf.format(obj));
		System.out.println(goodMf.format(obj));
	}
	
	public static void runMessage (String country, String name) {
		Locale local = null;
		if ("TW".equals(country.toUpperCase())) {
			local = Locale.TAIWAN;
		} else if ("US".equals(country.toUpperCase())) {
			local = Locale.US;
		} else {
			System.out.println("未支援該語言!!");
			return;
		}
		
		ResourceBundle bundle = ResourceBundle.getBundle("properties.message", local);
		String hello = bundle.getString("jason.hello");
		String good = bundle.getString("jason.good");
		MessageFormat helloMf = new MessageFormat(hello);
		MessageFormat goodMf = new MessageFormat(good);
		Object[] obj = {name};
		System.out.println(helloMf.format(obj));
		System.out.println(goodMf.format(obj));
		System.out.println();
	}
	
	public static void runMessage (String country) {
		runMessage(country,"");
	}
	

}
