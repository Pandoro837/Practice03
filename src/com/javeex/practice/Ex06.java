package com.javeex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		for (int iNum = 1 ; iNum > 0 && iNum <=100; iNum++) {
			if(iNum % 5 == 0 && iNum % 7 == 0) {
				System.out.println(iNum);
			}
		}

	}

}
