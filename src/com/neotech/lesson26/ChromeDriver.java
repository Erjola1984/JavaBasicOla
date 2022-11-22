package com.neotech.lesson26;

public class ChromeDriver implements WebDriver, Camera {

	String driver = "ChromeDriver";
	
	@Override
	public void takePicture() {
		System.out.println("We can take pictures!!!");
		
	}

	@Override
	public void openBrowser() {
		System.out.println("Please open the Browser to get the information!!");	
	}

	@Override
	public void closeBrowser() {
		System.out.println("Please close the Browser !!");
			
	}

	@Override
	public void maximizeWindow() {
		System.out.println("You can maximize the window to see better!!");		
	}

	@Override
	public void findElement() {
		System.out.println("Please find the elements that you need!!");
		
	}

}

	