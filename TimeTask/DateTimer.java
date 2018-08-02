package com.jason.timer;

import java.util.Calendar;
import java.util.TimerTask;

public class DateTimer extends TimerTask{
	
	public int sum = 1;
	
	int[] numberCount = {0,0,0,0,0,0};
	
	@Override
	public void run(){
		Calendar cal = Calendar.getInstance();
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m =cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		StringBuilder str = new StringBuilder();
		str.append("現在: ")
		.append(addZero(h) + ":")
		.append(addZero(m) + ":")
		.append(addZero(s))
		.append("\n");
		System.out.print(str);
	}
	
	public int getSum () {
		return sum; 
	}
	
	public int[] getTo () {
		return numberCount; 
	}
	
	private String addZero (Integer x) {
		String str = x.toString();
		if (str.length() == 1) {
			str = "0".concat(str);
		}
		return str;
	}
	
	
}
