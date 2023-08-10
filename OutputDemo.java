package com.byteapp;

import java.io.FileOutputStream;

public class OutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs = new FileOutputStream("myfile.txt");
			String str = "hello";
			byte [] bt = str.getBytes();
			
			fs.write(bt);
			fs.flush();
			fs.close();
		}
		catch(Exception e){
			
		}

	}

}
