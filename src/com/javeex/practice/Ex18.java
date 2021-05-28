package com.javeex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		int iCount = iNum;
		
		for(int iY = 0; iY < iNum; iY++) {
			
			for(int iX = 0; iCount - iX > 0; iX++) {
				System.out.print("*");
			}
			
			System.out.println("");
			iCount--;
			
		}
		
		for(int iY2 = 2; iY2 <= iNum; iY2++) {
			
			for(int iX2 = 0; iX2 < iY2; iX2++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
		sc.close();
	
	}

}
