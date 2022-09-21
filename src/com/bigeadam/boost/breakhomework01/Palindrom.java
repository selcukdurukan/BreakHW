package com.bigeadam.boost.breakhomework01;

import java.util.Scanner;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Write a word to look at whether is palindrom or not: ");
		String input = sc.next();
		sc.close();

		boolean value = true;
		int a = 1;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(input.length() - a)) {
				a += 1;
				value = true;
				continue;
			} else {
				value = false;
				break;
			}
		}
		if (value == true) {
			System.out.println("This word is palindrom.");
		} else {
			System.out.println("This word not palindrom.");
		}
		System.out.println("Bye...");
	}

}
