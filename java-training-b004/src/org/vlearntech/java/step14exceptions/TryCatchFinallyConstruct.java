package org.vlearntech.java.step14exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TryCatchFinallyConstruct {
	public static void main(String[] args) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile.1csv"));
			allLines.forEach(record -> System.out.println(record));
//			System.out.println("Program Completed");
		} catch (IOException e) {
			System.out.println("File could not be found.. hence exiting");
			return;
//			System.out.println("Program Completed");
		} finally {
			System.out.println("Program Completed");
		}

	}
}
