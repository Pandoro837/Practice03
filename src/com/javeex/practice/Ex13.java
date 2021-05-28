package com.javeex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int iCount = 1; iCount <= iNum; iCount++) {
			iSum = iSum + iCount;	
		}
		
		System.out.println("합계 : " + iSum);
		
		sc.close();
		
	}

}
