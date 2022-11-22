package com.neotech.lesson27;

interface WebDriver {
	 void open();// by default public and abstract
	 
	 void close();
	 
	 String getTitle();
 	
}

interface TakesScreenShot {
	
	void getScreenShot();
}

interface RemoteDriver extends WebDriver, TakesScreenShot {
	
	void navigate();
}




public class Homework2 {

}
