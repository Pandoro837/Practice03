package com.javeex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int iX = 1; iX <= 10; iX++) {
			System.out.print(iX + "\t");
			for(int iY = iX + 1; iY <= iX + 9; iY++) {
				System.out.print(iY + "\t");
			}
			System.out.println("");
		}

	}

}
