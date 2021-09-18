package org.vlearntech.java.step13files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadSmallFile {
	public static void main(String[] args) throws IOException {
		List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile.csv"));
		allLines.forEach(record -> System.out.println(record));
	}
}
