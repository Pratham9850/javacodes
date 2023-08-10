package com.threadutil;

class Cab 
{ 
	
}

class Locktask implements Runnable
{
	
	Cab cab;
	String name;
	public Locktask(Cab cab,String name)
	{ 
		this.cab=cab;
		this.name=name;
	}
	public void run() 
	{ 
		synchronized(cab)
		{
			 try
			 { 
				 System.out.println("cab is with "+this.name);
				 cab.wait();
				 System.out.println("cab lock release"+this.name);
				 
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class Releasetask implements Runnable
{ 
	 Cab cab;
	Releasetask(Cab cab)
	{ 
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try {
				Thread.sleep(5000);
				 cab.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class WaitDemo 
{ 
	 public static void main(String args[])
	 {
		 Cab cab =new Cab();
		 Locktask lock1=new Locktask(cab,"Peter");
		 Releasetask release1=new Releasetask(cab);
		 Thread t1=new Thread(lock1);
		 Thread t2=new Thread(release1);
		 t1.start();
		 t2.start();
		 
	 }
}