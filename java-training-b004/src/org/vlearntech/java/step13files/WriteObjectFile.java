package org.vlearntech.java.step13files;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WriteObjectFile {
	public static void main(String[] args) throws IOException {
		Path outputFilePath = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\Output_EmployeeObjectFile.txt");
		Files.deleteIfExists(outputFilePath);
		Files.createFile(outputFilePath);

		List<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("Subrat", LocalDate.of(2001, 10, 24), 'M', Boolean.FALSE, "Hyderabad"));
		peopleList.add(new Person("Swagatika", LocalDate.of(2002, 11, 12), 'F'));
		peopleList.add(new Person("Supreet", LocalDate.of(2000, 4, 11), 'M', Boolean.FALSE, "Bhopal"));
		peopleList.add(new Person("Priyabrat", LocalDate.of(1999, 10, 24), 'M', Boolean.FALSE, "Bhubaneswar"));
		peopleList.add(new Person("Atish", LocalDate.of(1998, 9, 20), 'M', Boolean.FALSE, "Cuttack"));

		ObjectOutputStream outputFile = new ObjectOutputStream(Files.newOutputStream(outputFilePath));

		for (Person p : peopleList) {
			try {
				outputFile.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Employee object file has been created with " + peopleList.size() + " records");

	}
}
