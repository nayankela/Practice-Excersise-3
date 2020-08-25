package practice_excersise_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Validate the IP 
//
//
//
//Bob is suspicious that one of his customers is a potential fraud. He kind of wants to validate the IP address shared by his customer to confirm this. His lead developer is on vacation & Bob wants your help to do this. 
//
//
//
//Information: The basic format of IP addresses is:
//
//It must start with a number from 0 – 255.
//It must be followed by a dot
//This pattern has to repeat for 4 times (eliminating the last dot)
//
//
//Using the below inputs to compile & evaluate your code.
//
//
//
//Expected Input 1:
//
//121.234.12.12
//
//
//Expected Output 1:
//
//Correct
//
//
//Expected Input 2:
//
//000.12.234.23.23
//
//
//Expected Output 2:
//
//Incorrect

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter IP Address:");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
				+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
		Matcher matcher = pattern.matcher(ip);

		if (matcher.matches()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}
}
