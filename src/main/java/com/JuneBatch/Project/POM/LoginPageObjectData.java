package com.JuneBatch.Project.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjectData {
	private WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_Email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_Password;
	@FindBy(how=How.XPATH,using="//button[@id='u_0_d_LG']")
	private WebElement btn_login;

	public LoginPageObjectData() {
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTxt_Email() {
		return txt_Email;
	}

	public void setTxt_Email(WebElement txt_Email) {
		this.txt_Email = txt_Email;
	}

	public WebElement getTxt_Password() {
		return txt_Password;
	}

	public void setTxt_Password(WebElement txt_Password) {
		this.txt_Password = txt_Password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

	public void setBtn_login(WebElement btn_login) {
		this.btn_login = btn_login;
	}
}