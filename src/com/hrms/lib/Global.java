package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {

	public    WebDriver driver;
	//std:rule: To provide TestData & objects related to whole application
	//***********TestData
	// DT VAR VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String username = "nareshit";
	public String password = "nareshit";
	public String empfn="akhil";
	public String empln="selenium";
	
	
	//***********objects/elements
	public String txt_loginame = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String btn_Add = "//input[@value='Add']";
	public String empfname="txtEmpFirstName";	//name
	public String emplname="txtEmpLastName";//name
	}

