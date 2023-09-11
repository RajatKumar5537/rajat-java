package com.vyaparapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productOrder {
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@alt='Car']")
	private WebElement product;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//span[text()='1']")
	private WebElement viewCart;

	@FindBy(xpath = "//input[@id='customerName']")
	private WebElement cn;

	@FindBy(xpath = "//input[@class='form-control catalogue-cart_phone-input__Fu8RP']")
	private WebElement mn;


	@FindBy(xpath = "//textarea[@id='customerAddress']")
	private WebElement adrs;
	
	@FindBy(xpath = "//div[text()='Place Order']")
	private WebElement plor;
	
	public productOrder(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void placeOrder(String cnm, String mno, String adrss) {
		product.click();
		addToCart.click();
		viewCart.click();
		cn.sendKeys(cnm);
		mn.sendKeys(mno);
		adrs.sendKeys(adrss);
		plor.click();
	}
}
