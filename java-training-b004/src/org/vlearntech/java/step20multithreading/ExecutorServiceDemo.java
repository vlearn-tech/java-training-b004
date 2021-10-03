package org.vlearntech.java.step20multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		PrintNumbersTaskThread task1 = new PrintNumbersTaskThread(1);
		PrintNumbersTaskThread task2 = new PrintNumbersTaskThread(2);
		PrintNumbersTaskThread task3 = new PrintNumbersTaskThread(3);
		PrintNumbersTaskThread task4 = new PrintNumbersTaskThread(4);
		PrintNumbersTaskThread task5 = new PrintNumbersTaskThread(5);
		PrintNumbersTaskThread task6 = new PrintNumbersTaskThread(6);
		es.execute(task1);
		es.execute(task2);
		es.execute(task3);
		es.execute(task4);
		es.execute(task5);
		es.execute(task6);
		es.shutdown();

		// Future
		// Callable

	}
}
