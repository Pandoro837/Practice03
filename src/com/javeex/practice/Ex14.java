package com.javeex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int iCount = 1; iCount <= iNum; iCount++) {
			
			if(iCount == 1) {
				System.out.print(iCount);
			} else {
				iSum = iSum + iCount;	
				System.out.print("+" + iCount);
			}
		}
		System.out.println("");
		System.out.println("합계 : " + (1 + iSum));
		
		sc.close();

	}

}
