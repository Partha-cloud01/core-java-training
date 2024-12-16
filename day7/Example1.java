package com.day7;

class Thread2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" My thread is running");
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		Thread2 thr = new Thread2();
		thr.setName("T1");
		thr.start();
		
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		}
		thr.join();
		
		System.out.println("Main Ends");

	}

}
