package com.byteapp;

import java.io.*;
public class BugDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream in = System.in;
		try {
			byte[]bt = new byte[50];
			System.out.println("Enter dev name");
			byte [] bt1 = new byte[50];
			in.read(bt1);
//			String devname = new String(bt1);
			
			System.out.println("Enter bug num");
			byte [] bt2 = new byte[20];
			in.read(bt2);
//			String bug = new String(bt2);
			
			System.out.println("Enter bug desc");
			byte [] bt3 = new byte[20];
			in.read(bt3);
//			String bugdesc = new String(bt3);
			
			
			FileOutputStream fs = new FileOutputStream("bugdetails.txt");
			fs.write(bt1);
			fs.write(bt2);
			fs.write(bt3);
			fs.flush();
			fs.close();

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
