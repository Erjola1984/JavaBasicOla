package com.neotech.lesson23;

public class UserClass {
	
	
	String name;
	long mobileNumber;
	
	//default constructor
	UserClass()
	
	{
		
	}
	
	public UserClass(String name, long mobileNumber) {
	
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
}
	class UserInfo extends UserClass
	{
		String UserAddress;
	
		UserInfo (String name, long mobileNumber, String userAddress)
		{
			super(name, mobileNumber);
			this.UserAddress = userAddress;
		}	
		
		void userDetails()
		{
			System.out.println("User Details:");
			System.out.println("Name -> " + name);
			System.out.println("Mobile -> " + super.mobileNumber);
			System.out.println("Address -> " + UserAddress);
		}
	
public static void main(String[] args) {
		
	}

}
