package com.instagram.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InstagramController {
	BufferedReader br;
	String name;
	String mobile;
	String email;
	String password;
	
	public InstagramController(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void loginProfile()throws Exception {
		
		System.out.println("Enter Name");
		name = br.readLine();
		System.out.println("Enter Mobile Number");
		mobile = br.readLine();
		System.out.println("Enter Email");
		email = br.readLine();
		System.out.println("Enter Password");
		password = br.readLine();

		System.out.println("Details below: ");
		System.out.println("Name is " + name);
		System.out.println("Mobile number is " + mobile);
		System.out.println("Email is " + email);
		System.out.println("Password is " + password);
	}		
	

	public void newsFeed() {
		System.out.println("Loading News feed.....please wait");
	}

	public void addPhoto() {
		System.out.println("Please select a photo to add: ");
		System.out.println("Adding photo....");
	}

	public void editProfile()throws Exception {
		System.out.println("Want to edit something...Y/N: ");
		String y = br.readLine();		
	}

	public void openReels() {
		System.out.println("Opening Reels.......");		
	}

	public void recentActivity() {
		System.out.println("There is no recent activity...Sorry:-)");		
	}

}
