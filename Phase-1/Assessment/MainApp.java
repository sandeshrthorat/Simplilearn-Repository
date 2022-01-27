package com.lockedme;

import java.io.IOException;

import company.locker.ltd.com.FileApplication;

public class MainApp {

	
	public static void main(String[] args)throws IOException{
		System.out.println("Program Started");
		FileApplication  fa=new FileApplication();
		try {
		fa.Menu();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}
}
