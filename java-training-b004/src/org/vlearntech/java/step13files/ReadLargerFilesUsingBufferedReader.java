package org.vlearntech.java.step13files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLargerFilesUsingBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = Files
				.newBufferedReader(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile.csv"));
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
