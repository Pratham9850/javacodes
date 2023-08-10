package com.threadutil;

import java.util.Scanner;

class UserDetails extends Thread{
	
	public void acceptdetails() {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		String emailId = scn.nextLine();
		
		System.out.println("Name:" + name +"email: " + emailId);
		
	}
	
	public void run() {
		acceptdetails();
		
	}
	
}
class SimpleInterest extends Thread{
	public void calculateinterest() {
		System.out.println(1500*200*5);
	}
	
	public void run() {
		calculateinterest();
		
	}
}

public class ThreadExercise {

	public static void main(String[] args) {
		
		UserDetails u1 = new UserDetails();
		u1.start();
		SimpleInterest s1 = new SimpleInterest();
		s1.start();		
		
	}

}
