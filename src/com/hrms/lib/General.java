package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

import org.openqa.selenium.By;


public class General extends Global{
	
	//std rule: To provide all re-usable fun:/methods related to whole application
	

		public void openApplication() {
			driver = new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Application Opened");
            Log.info("Application opened");

			}
		
			public void closeApplication() {
				
			driver.quit();
			System.out.println("Application closed");
            Log.info("Application closed");
			}
			public void login() {
			driver.findElement(By.name(txt_loginame)).sendKeys(username);
			driver.findElement(By.name(txt_password)).sendKeys(password);
			driver.findElement(By.name(btn_login)).click();
			
			System.out.println("Login completed");
			Log.info("Login completed");
	}
			public void close() {
				driver.close();
			}
			
			public void Addemployee() throws InterruptedException {
				driver.switchTo().frame("rightMenu");
                 System.out.println("frames enterd");
                 Log.info("Frames Entered");
                 
				driver.findElement(By.xpath(btn_Add)).click();
                Thread.sleep(3000);
               
				driver.findElement(By.name(empfname)).sendKeys(empfn);
				driver.findElement(By.name(emplname)).sendKeys(empln);
				driver.switchTo().defaultContent();

				
			}

			public void logout() {
				driver.findElement(By.linkText(link_logout)).click();
				
				

			}


}
