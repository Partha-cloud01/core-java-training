package com.day7;

class Two implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i +" * 2 = "+ (i*2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Five extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i +" * 5 = "+ (i*5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Table25 {

	public static void main(String[] args)  {
		Thread t1 = new Thread(new Two());
		t1.setName("Two");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		Five t2 = new Five();
		t2.setName("Five");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Method ends");
	}

}
