package com.javeex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		for (int iNum01 = 1; iNum01 <= 9; iNum01++) {
			
			for (int iNum02 = 2; iNum02 <=9; iNum02++) {
				int iMulty = iNum01 * iNum02;
				if (iMulty >= 10) {
					System.out.print(iNum02 + " * " + iNum01 + " = " + (iNum02 * iNum01) + "   ");
				} else {
					System.out.print(iNum02 + " * " + iNum01 + " = " + (iNum02 * iNum01) + "    ");
				}
				
			}
		System.out.println("");
		}

	}

}
