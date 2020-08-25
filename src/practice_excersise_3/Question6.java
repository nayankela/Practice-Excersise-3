package practice_excersise_3;
//Expected Input 1:

//
//riyaAyaz@
//135
//
//
//Expected Output 1:
//
//Strong password!
//
//
//Expected Input 2:
//
//riyaayaz@
//135
//
//
//Expected Output 2:
//
//A weak password, 
//change it!

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("Enter Password:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String password = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		Pattern pattern = Pattern.compile(password);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Strong password!");
		} else {
			System.out.println("A weak password, change it!");
		}
		sc.close();
	}
}
