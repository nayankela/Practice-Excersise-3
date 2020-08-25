package practice_excersise_3;

import java.util.Scanner;

public class Question5 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Enter the content:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String name1 = " ";
		String name2 = " ";
		String regex = "[a-zA-Z0-9]";
		int length = name.length();

		for (int i = 0; i < length; i++) {
			char c = name.charAt(i);
			if (name.valueOf(c).matches(regex)) {
				name1 = name1 + c;
			} else {
				name2 = name2 + c;

			}
		}

		String result = name1 + name2;
		System.out.println(result);
		scanner.close();
	}
}
