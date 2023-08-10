package com.threadutil;


class PrintNames implements Runnable { 
	String[] names={"Peter","Sam","Edgar","Mathew","Simond"}; 
	public synchronized void printArray()
	{ for(String s:names)
		{ System.out.println(s); 
		}
	}
	public void run(){
		printArray(); 
		}
	}
public class SynchronizeDemo{
	public static void main(String[] args){
		PrintNames printNames = new PrintNames(); 
		Thread t1 = new Thread(printNames);
		Thread t2 = new Thread(printNames);
		t1.start(); 
		t2.start();
		}
	}