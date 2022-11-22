package com.neotech.lesson26;

public  class FireFoxdriver implements WebDriver, Camera{
	
	public  void openBrowser() {
		System.out.println("Open the browser.");
	}
	
	public  void closeBrowser() {
		System.out.println("Close the browser.");
	}
	
	public  void maximizeWindow() {
		System.out.println("Maximize the window.");
	}
	
	public  void findElement() {
		System.out.println("Find the element.");
	}

	@Override
	public void takePicture() {
		System.out.println("Take picture please!!");
	}
	
	

}
