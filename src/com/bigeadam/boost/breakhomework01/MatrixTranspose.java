package com.bigeadam.boost.breakhomework01;

/**
 * @author selcukdurukan
 * @version 1.0
 * @email selcukdurukan@outlook.com.tr
 * @category This is first break homework, which was given.
 */

public class MatrixTranspose {

	public static void main(String[] args) {
		
		double original[][]={{1,3,4},{2,4,3},{3,4,5}};    
		transposeMatrix(original);
		for (double[] ds : original) {
			System.out.println(ds);
		}
		System.out.println(original.toString());
		System.out.println("Bye...");
		
	}
	
    public static double[][] transposeMatrix(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

}
