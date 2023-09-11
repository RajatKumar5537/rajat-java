package com.rajat.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAT {

	@FindBy(id="username")
	private WebElement untbx;

	@FindBy(name="pwd")
	private WebElement pwdtx;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(id="logoutLink")
	private WebElement lgout;

	public LoginPageAT(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwdtx.sendKeys(pw);
		lgbtn.click();
		lgout.click();
	}
}
