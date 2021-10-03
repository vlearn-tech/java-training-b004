package org.vlearntech.java.step20multithreading;

public class PrintNumbersTaskRunnable implements Runnable {

	private int num;

	public PrintNumbersTaskRunnable(int num) {
		this.num = num;
	}

	public void printNumbers() throws InterruptedException {
		System.out.println("\nStarting task for num = " + this.num);
		for (int i = (100 * this.num); i < 100 * (this.num + 1); i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask completed num = " + this.num);
	}

	@Override
	public void run() {

		try {
			printNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

}
