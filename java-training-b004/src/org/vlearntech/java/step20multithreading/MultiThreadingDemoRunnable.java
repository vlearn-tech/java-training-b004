package org.vlearntech.java.step20multithreading;

public class MultiThreadingDemoRunnable {
	public static void main(String[] args) throws InterruptedException {

		PrintNumbersTaskThread task1 = new PrintNumbersTaskThread(1);
		Thread t1 = new Thread(task1);
		t1.start();

		PrintNumbersTaskThread task2 = new PrintNumbersTaskThread(2);
		Thread t2 = new Thread(task2);
		t2.start();

		PrintNumbersTaskThread task3 = new PrintNumbersTaskThread(3);
		Thread t3 = new Thread(task3);
		t3.start();

		// Read data from employees file (30 sec)
		// Read data from department file (20 sec)
		// Read data from location file (20 sec)

		// Consolidate the data

		// Write data into output report

	}
}
