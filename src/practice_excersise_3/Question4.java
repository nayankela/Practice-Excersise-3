package practice_excersise_3;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Question4 {

	public static void main(String[] args) {

		// Z = UTC+0
		Instant instant = Instant.now();

		System.out.println("Instant : " + instant);

		// Japan = UTC+9
		ZonedDateTime jpTime = instant.atZone(ZoneId.of("America/Chicago"));

		System.out.println("ZonedDateTime : " + jpTime.toLocalDateTime());

	}
}
