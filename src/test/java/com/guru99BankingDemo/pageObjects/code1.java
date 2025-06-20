package com.guru99BankingDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class code1 {
	WebDriver ldriver;

	public code1(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

}
