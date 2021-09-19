package org.vlearntech.java.step14exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WithoutTryWithResourceExample {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\InputDataFile.csv"));
			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Some error occured");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//			e.printStackTrace();
			} // should close
		}
	}
}
