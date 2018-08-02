package com.jason.timer;

import java.util.Date;
import java.util.Timer;

public class RunTimer {

	public static void main(String[] args) {
		run2(10);
	}
	
	public static void run2 (long milliseconds) {
		Timer timer = new Timer();
		timer.schedule(new DateTimer(),new Date(),1000);
		
		try {
			Thread.sleep(milliseconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
	}

}
