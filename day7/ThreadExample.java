package com.day7;
class Thread4 extends Thread
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

public class ThreadExample {

	public static void main(String[] args)  {
		Thread4 otr = new Thread4();
		otr.setName("T1");
		otr.start();
		
		try 
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
		}
	}

}
