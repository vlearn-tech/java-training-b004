package org.vlearntech.java.step99miniproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

	public static List<String> getAllLines(String pathURI) throws IOException {
		return Files.readAllLines(Paths.get(pathURI));
	}

}
