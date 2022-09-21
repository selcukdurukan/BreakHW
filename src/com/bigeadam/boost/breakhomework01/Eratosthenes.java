package com.bigeadam.boost.breakhomework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

public class Eratosthenes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write a number to see prime number until this number (sieve of Erastosthenes): ");
		if (sc.hasNextInt()) {
			int input = sc.nextInt();
			sc.close();
			List<Integer> arList = new ArrayList<>();

			for (int i = 2; i <= input; i++) {
				arList.add(i);
			}
//			for (int j = 0; j < arList.size(); j++) {
//				System.out.print(arList.get(j) + " ");
//			}
			for (int k = 0; k < arList.size(); k++) {
				int l = 1;
				for (l = k + l; l < arList.size(); l++) {
					if (arList.get(l) % arList.get(k) == 0) {
						arList.remove(l);
					}
				}
			}
			System.out.println();
			System.out.println("Your prime numbers are: ");
			for (int m = 0; m < arList.size(); m++) {
				System.out.print(arList.get(m) + " ");
			}
		} else {
			System.out.println("Please write a number!!");
		}
		System.out.println("\nBye...");
	}
}
