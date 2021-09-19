package org.vlearntech.java.step99miniproject;

import java.io.IOException;

public class ProjectDriverClass {
	public static void main(String[] args) {

		try {
			DataProcessor.processRecords(
					FileUtils.getAllLines("C:\\Users\\HP\\Desktop\\JavaFiles\\MiniProject\\NewInputFile.csv"));
		} catch (IOException e) {
			System.out.println("Error occurred in processing file. Check logs for exception.");
		}

	}
}
