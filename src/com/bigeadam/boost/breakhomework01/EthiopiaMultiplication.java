package com.bigeadam.boost.breakhomework01;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EthiopiaMultiplication {

	public static void main(String[] args) {

		List<Integer> fArrayList = new ArrayList<>();
		List<Integer> sArrayList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first numper to multipy: ");
		Integer fNumber = sc.nextInt();

		System.out.print("Please enter second numper to multipy: ");
		Integer sNumber = sc.nextInt();
		sc.close();

		fArrayList.add(fNumber);
		sArrayList.add(sNumber);
		int result1 = fNumber / 2;
		fArrayList.add(result1);
		int result2 = sNumber * 2;
		sArrayList.add(result2);

		while (true) {
			result1 = result1 / 2;
			fArrayList.add(result1);

			result2 = result2 * 2;
			sArrayList.add(result2);

			if (result1 == 1) {
				break;
			}
		}
		int i = 0;
		for (; i < fArrayList.size(); i++) {
			if (fArrayList.get(i) % 2 == 0) {
				fArrayList.remove(i);
				sArrayList.remove(i);
				i = -1;
			}
		}
		int sum = 0;
		for (int j = 0; j < sArrayList.size(); j++) {
			sum = sum + sArrayList.get(j);
		}
		System.out.println();
		System.out.println("Your Ethiopia Multiplication result is: " + sum);
		System.out.println("Bye...");
	}

}
