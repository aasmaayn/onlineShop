package com.zak.application.others;

import org.springframework.stereotype.Component;


public class LoopRunner implements Runnable {
	
	
	
	public LoopRunner() {

	}


	@Override
	public void run() {
    	while(true) {
    		System.out.println("active");
    		try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}

	}

}
