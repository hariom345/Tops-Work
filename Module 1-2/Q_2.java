//• Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//message. 
package Module2;

import java.util.Scanner;

public class Q_2 {
	public static void main(String[] args) {
		/*
		 * Write a Java program that takes the user to provide a single character from
		 * the alphabet. Print Vowel or Consonant, depending on the user input. If the
		 * user input is not a letter (between a and z or A and Z), or is a string of
		 * length > 1, print an error message.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your single character from the alphabet:");
		String input = sc.nextLine();

		if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
			System.out.println("Error: Invalid input! Please enter a single letter.");
		} else {
			char letter = Character.toLowerCase(input.charAt(0));
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				System.out.println("It's a vowel!");
			} else {
				System.out.println("It's a consonant!");
			}
		}
	}
}