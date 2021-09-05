package org.vlearntech.java.step09dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateExample {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();

		System.out.println(now);
		DateTimeFormatter defaultPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		System.out.println(now.format(defaultPattern));

//		for (String thisValue : ZoneId.getAvailableZoneIds()) {
//			System.out.println(thisValue);
//		}

		ZonedDateTime nowInIndia = now.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println("Time in India :: " + nowInIndia.format(defaultPattern));

		ZonedDateTime nowInSingapore = nowInIndia.withZoneSameInstant(ZoneId.of("Singapore"));
		System.out.println("Singapore Time :: " + nowInSingapore.format(defaultPattern));

		ZonedDateTime nowInLondon = nowInIndia.withZoneSameInstant(ZoneId.of("Europe/London"));
		System.out.println("London Time :: " + nowInLondon.format(defaultPattern));

		//

		ZonedDateTime nowInPhoenix = nowInIndia.withZoneSameInstant(ZoneId.of("US/Mountain"));
		System.out.println("Phoenix Time :: " + nowInPhoenix.format(defaultPattern));

	}
}
