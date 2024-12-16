package com.day7;

class Thread5 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " My thread is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example3 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread5());
		th1.setName("Partha");
		th1.start();

	}

}
