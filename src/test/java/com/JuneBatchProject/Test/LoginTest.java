package com.JuneBatchProject.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.JuneBatch.Project.POM.LoginPageObjectData;
import com.JuneBatch.Project.Utility.BaceClass;

public class LoginTest extends BaceClass {
@Test
public void VERIFY_lOGINtEST_001() {
	// PageFactory.initElements(driver, LoginPageObject.Class);
LoginPageObjectData login=PageFactory.initElements(driver,LoginPageObjectData.Class);
	//login.get
}
}
