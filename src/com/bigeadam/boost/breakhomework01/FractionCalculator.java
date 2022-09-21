package com.bigeadam.boost.breakhomework01;

import java.util.Scanner;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

public class FractionCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please write first number (a/b --> for a): ");
		int a = (int) sc.nextDouble();
		
		System.out.print("Please write first number (a/b --> for b): ");
		int b = (int) sc.nextDouble();
		
		System.out.println("First fraction is: " +a + "/" + b );
		
		System.out.print("Please write first number (c/d --> for c): ");
		int c = (int) sc.nextDouble();
		
		System.out.print("Please write first number (c/d --> for d): ");
		int d = (int) sc.nextDouble();
		
		System.out.println("Second fraction is: " +c + "/" + d );
		
		System.out.println("\nWhat would you do? \n\t1)Addition \n\t2)Subtractin \n\t3)Multiplication \n\t4)Addition \nPlease write 1,2,3 or 4.");
		int input4 = sc.nextInt();
		sc.close();
		
		int result = 0;
		int result1 =0 ;
		switch (input4) {
		case 1:
			result = ((a*d) + (b*c));
			result1 = b*d;
			break;
		case 2:
			result = ((a*d) - (b*c));
			result1 = b*d;
			break;
		case 3:
			result = a*c;
			result1 = b*d;
			break;
		case 4:
			result = a*d;
			result1 = b*c;
			break;
		default:
			System.out.println("Something going wrong...");
			break;
		}
		int f = 2;
		if (result<result1) f=result;
		else f=result1;
		for (int i = 2; i < f; i++) {
			if (result % i == 0 && result1 % i ==0) {
				result = result/i;
				result1 = result1/i;
				i--;
			} 
		}
		System.out.print("Your result is: " +result+ "/" +result1 );
		System.out.println("Bye...");
	}

}
