package org.vlearntech.java.step20multithreading;

public class MultiThreadingDemoThread {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("\nStarting processing");

		PrintNumbersTaskThread task1 = new PrintNumbersTaskThread(1);
		PrintNumbersTaskThread task2 = new PrintNumbersTaskThread(2);
		PrintNumbersTaskThread task3 = new PrintNumbersTaskThread(3);

		task1.setPriority(Thread.MAX_PRIORITY); // advice
		task2.setPriority(Thread.NORM_PRIORITY); // advice
		task3.setPriority(Thread.MIN_PRIORITY); // advice

		task1.start();
		task2.start();

		task1.join(); // This means control will wait till task1 has completed to move further
		task2.join(); // This means control will wait till task2 has completed to move further

		task3.start();

		System.out.println("\nEnding processing");
		// Read data from employees file (30 sec)
		// Read data from department file (20 sec)
		// Read data from location file (20 sec)

		// Consolidate the data

		// Write data into output report

	}
}
