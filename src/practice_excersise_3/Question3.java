package practice_excersise_3;

import java.time.LocalDate;
import java.util.Scanner;

//Expected Output:
//2020
//March
//22
public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = scanner.nextInt();
		System.out.println("Enter the Month");
		int month = scanner.nextInt();
		System.out.println("Enter the Days of Month");
		int dayOfMonth = scanner.nextInt();
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		System.out.println("Date is: " + date);
		System.out.println("Output: \n" + date.getYear() + "\n" + date.getMonth() + "\n" + date.getDayOfMonth());
		scanner.close();

	}
}
