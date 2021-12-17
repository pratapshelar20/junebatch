package com.JuneBatch.Project.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaceClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	@BeforeSuite
	public void BS() throws IOException {
	System.out.println("I AM Before Suite");
	 config=new ConfigDataProvider();
	}
	@BeforeTest
	public void BT() {
	System.out.println("I AM Before Test");
	}
	@BeforeClass
	public void BC() {
	System.out.println("I AM Before Class");
	}
	@BeforeMethod
	public void SetUp() {
System.out.println("Browser Open--->");
//System.setProperty("Key", ".exe");//no need to write this line WebDriver manager can manage this. 
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.get(config.getUrl());
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
}
@AfterMethod
	public void TeatDown() {
	System.out.println("Browser Close-->");
	driver.quit();
}
@AfterClass
public void AC() {
System.out.println("I AM After Class");
}
@AfterTest
public void AT() {
System.out.println("I AM After Test");
}
@AfterSuite
public void AS() {
System.out.println("I AM After Suite");
}
}