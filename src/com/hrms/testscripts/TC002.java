package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	
	@Test
	public void tc002() throws InterruptedException {
	
//public static void main(String[] args) throws InterruptedException {
		
	DOMConfigurator.configure("Log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.Addemployee();
	obj.logout();
	obj.closeApplication();
}

	
}

