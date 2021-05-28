package com.javeex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int iNum = sc.nextInt();
		
		for(int iCount = 1; iCount <= iNum; iCount++) {
			for(int iX = 0; iX < iCount; iX++) {
				System.out.print(iCount);
			}
			System.out.println("");
		}
			
		sc.close();

	}

}
