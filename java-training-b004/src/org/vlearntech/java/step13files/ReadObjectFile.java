package org.vlearntech.java.step13files;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadObjectFile {
	public static void main(String[] args) throws IOException {

		Path outputFilePath = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\Output_EmployeeObjectFile.txt");
		ObjectInputStream file = new ObjectInputStream(Files.newInputStream(outputFilePath));

		Person p;

		try {
			while ((p = (Person) file.readObject()) != null) {
				if (p.age > 20) {
					System.out.println(p);
				}
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
