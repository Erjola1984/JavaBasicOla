package com.neotech.lesson26;

public interface WebDriver {
	
	//Homework 1:
	 //  Create a WebDriver Interface that will have the following unimplemented behaviour: 
	 // openBrowser(), 
	//   closeBrowser(), 
	 // maximizeWindow(), 
	 //  findElement(). 

	  // Create another interface named Camera that will have the method:
	 //  takePicture();
	//Create 2 classes that implements WebDriver 
	//and Camera interfaces: ChromeDriver and FirefoxDriver.
	
	
	public abstract void openBrowser();//they are by default abstract, we can not put abstract
	
	public abstract void closeBrowser();
	
	public abstract void maximizeWindow();
	
	public abstract void findElement();
	
	

}
