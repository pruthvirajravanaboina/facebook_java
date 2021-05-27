package com.instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramController;

public class InstagramView {

	public static void main(String[] args)throws Exception {
		String ss = "y";
		while(ss.equals("y")){
			System.out.println("*******MAIN MENU******");
			System.out.println("press 1 for Login Profile");
			System.out.println("press 2 for News Feed"); 
			System.out.println("press 3 for Add Photo");
			System.out.println("press 4 for edit profile"); 
			System.out.println("press 5 for Open Reels");
			System.out.println("press 6 for Recent Activity"); 
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your choice: ");
			String b=br.readLine();
			int c=Integer.parseInt(b);
			InstagramController ic = new InstagramController();
			
			switch(c) {
			case 1 : ic.loginProfile();
				break;
			case 2: ic.newsFeed();
				break;
			case 3 :ic.addPhoto();
				break;
			case 4 : ic.editProfile();
				break;
			case 5 :ic.openReels();
				break;
			case 6:ic.recentActivity();
				break;
			default:System.out.println("wrong choice");
			}
			System.out.println("do you want to continue press y/n");
			ss=br.readLine();
			//ss=sc.next();
		}
		}
	}

