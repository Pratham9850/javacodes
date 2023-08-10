package com.byteapp;

import java.io.*;
 class CharacterStream {
   public static void main(String args[]) throws IOException {
      try {
      OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("employee.txt"));
      writer.write("Employee Name : Peter Sam Joes\n");
      writer.write("Designation : Manager \n"); 
      writer.write("Salary : 35000");
      writer.flush();
      writer.close();
      
      InputStreamReader reader = new InputStreamReader(new FileInputStream("employee.txt"));
      char[] cstr = new char[1000];
      reader.read(cstr);
      System.out.println(cstr);
      }
      catch(IOException e) {
    	  
      }
   }
}
