package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCounterListener implements HttpSessionListener {

	int counter = 0;

	public void sessionCreated(HttpSessionEvent se) {
		counter++;
		System.out.println("IN -> "+counter);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		counter--;
		System.out.println("OUT -> "+counter);

	}
}
