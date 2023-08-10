package com.byteapp;
import java.io.*;
public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fstream = new FileOutputStream("bufferdata.txt");
			BufferedOutputStream bufferout = new BufferedOutputStream(fstream);
			bufferout.write("Developer name: Pratik ".getBytes());
			bufferout.write("Bug no: 101 ".getBytes());
			bufferout.write("Bug Descprition: No idea ".getBytes());
			bufferout.flush();
			bufferout.close();
			
			FileInputStream finstream = new FileInputStream("bufferdata.txt");
			BufferedInputStream bufferin = new BufferedInputStream(finstream);
			byte[] bt = new byte[bufferin.available()];
			bufferin.read(bt);
			System.out.println(new String(bt));
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
