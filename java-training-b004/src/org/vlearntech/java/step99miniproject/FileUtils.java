package org.vlearntech.java.step99miniproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

public class FileUtils {

	public static List<String> getAllLines(String pathURI) throws IOException {
		return Files.readAllLines(Paths.get(pathURI));
	}

	public static void saveRegionalReport(String pathURI, Map<Region, RegionalDetailReport> regionalReportMap)
			throws IOException {

		Path outputFilePath = Paths.get(pathURI);
		Files.deleteIfExists(outputFilePath);
		Files.createFile(outputFilePath);

		regionalReportMap.values().forEach(record -> {
			try {
				Files.writeString(outputFilePath, record + "\n", StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

	}

}
