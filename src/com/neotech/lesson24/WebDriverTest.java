package com.neotech.lesson24;

public class WebDriverTest {

	public static void main(String[] args) {
		// Runtime polumorphism
		//method overriding
		//the driver will openthe browser depending 
		//on the object that has been created
		
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();

	}

}
