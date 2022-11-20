package com.bigeadam.boost.breakhomework01;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write a word to backtrack: ");
		String input = sc.next();
		sc.close();
		Backtracking.recursiveMethod(input);

	}

	private static void recursiveMethod(String x) {

		for (int i = 1; i <x.length()+1 ; i++) {
			System.out.print(x.charAt(x.length()-i));
		}
		
		//TODO I'll do this homework with recursive method later.
	}

}
