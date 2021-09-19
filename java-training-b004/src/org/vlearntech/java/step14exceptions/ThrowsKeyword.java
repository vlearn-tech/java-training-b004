package org.vlearntech.java.step14exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ThrowsKeyword {
	public static void main(String[] args) throws MyOwnException {
		try {
			processAndPrintFileContents("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile1.csv");
		} catch (IOException e) {
			throw new MyOwnException("There was a problem in processing the file.. Hence skipping");
		}
		System.out.println("Program Completed");
	}

	private static void processAndPrintFileContents(String filePath) throws IOException {
		List<String> allLines = Files.readAllLines(Paths.get(filePath));
		allLines.forEach(record -> System.out.println(record));
	}

}
