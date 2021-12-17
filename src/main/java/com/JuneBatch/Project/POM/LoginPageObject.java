package com.JuneBatch.Project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {
	WebDriver driver;
//https://www.facebook.com/  //input[@id='email']
	
	//@findBy(How.XPATH,using=input[@id='email'])
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_Email; //for using data hidden
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_Password;
	
	@FindBy(how=How.XPATH,using="//button[@id='u_0_d_LG']")
	private WebElement btn_login;

	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}

}
