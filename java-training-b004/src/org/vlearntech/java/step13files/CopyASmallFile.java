package org.vlearntech.java.step13files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CopyASmallFile {
	public static void main(String[] args) throws IOException {
		List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile.csv"));
		Path outputFilePath = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\OutputDataFile.csv");
		Files.deleteIfExists(outputFilePath);
		Files.createFile(outputFilePath);

		allLines.forEach(record -> {
			try {
				Files.writeString(outputFilePath, record + "\n", StandardOpenOption.APPEND);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		System.out.println("File has been copied");

	}
}
