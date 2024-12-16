package com.day7;

class Thread3 extends Thread
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

public class MyThread1 {

	public static void main(String[] args) {
//		Thread t1 = Thread.currentThread();
//		System.out.println(t1);
//		
//		System.out.println(t1.getPriority());
//		System.out.println(t1.getName());
//		System.out.println(t1.getState());
		
		System.out.println("main started");
		
		Thread3 t1 = new Thread3();
		t1.setName("T1");
		t1.start();
		Thread3 t2 = new Thread3();
		t2.setName("T2");
		t2.start();
		
		System.out.println("Main Ended");

	}

}
