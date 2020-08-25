package practice_excersise_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Format Current Data & Time
//Expected Input:
//Assign value 
//in LocalDateTime as (2020,11,03,05,21,30)
//Expected Output:
//2020/02/28 09:26:52
public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		System.out.println("Enter the month");
		int month = scanner.nextInt();
		System.out.println("Enter the dayOfMonth");
		int dayOfMonth = scanner.nextInt();
		System.out.println("Enter the hour");
		int hour = scanner.nextInt();
		System.out.println("Enter the minute");
		int minute = scanner.nextInt();
		System.out.println("Enter the second");
		int second = scanner.nextInt();

		LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
		System.out.println("Before format: " + dateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		String formatDateTime = dateTime.format(formatter);

		System.out.println("After format: " + formatDateTime);
		
		scanner.close();
	}
}
