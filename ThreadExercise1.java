package com.threadutil;

import java.util.Scanner;

//1.Erric has to build an application where details of user is entered and after 5 seconds a message is printed hello user
//2.In the above program a thread is running parallely display a count of number after every two seconds ,this thread should not end 
//until previous thread has ended

class MyThread extends Thread{
	
	public void run() {
		Thread th = Thread.currentThread();
		try {
			Thread.sleep(5000);
			System.out.println("Hello user");
		}
		catch(InterruptedException e) {
			
		}
		
	}
}

class Mythread2 extends Thread{
	
	public void run(){
		
		Thread th = Thread.currentThread();
		int i = 1;
		while(MyThread.currentThread().isAlive()) {
			System.out.println("NumberCount" + i);
			i++;
			try {
				Thread.sleep(2000);
			
			}
			catch(InterruptedException e) {
				System.out.println(e);
				break;
			
		}
	}
}}


public class ThreadExercise1 {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner scn = new Scanner(System.in);
//		String name = scn.nextLine();
//		String emailId = scn.nextLine();
//		System.out.println("user details entered");

		MyThread t1 = new MyThread();
		Mythread2 t2 = new Mythread2();
		t1.start();
		
		t2.start();
		try {
			t1.join();
			t2.interrupt();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
