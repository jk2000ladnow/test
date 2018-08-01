package com.jason.test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nProperties {

	public static void main(String[] args) {
		I18nProperties self = new I18nProperties();
		self.runEnUs();
		System.out.println();
		self.runZhTw();
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
		Object[] obj = {"gg", "ininder"};
		System.out.println(helloMf.format(obj));
		System.out.println(goodMf.format(obj));
	}

}
