package com.byteapp;
import java.io.*;
public class PrintBugDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		FileInputStream fin = new FileInputStream("bugdetails.txt");
		byte [] bt = new byte[fin.available()];
		fin.read(bt);
		for(byte b : bt) {
			System.out.print((char)b);
		}
		}
		catch(Exception e){
			
		}

	}

}
