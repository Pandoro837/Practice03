package com.javeex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int iNum = sc.nextInt();
		
		if(iNum % 2 == 0) {
			for(int iEven = 0; iEven <= iNum; iEven = iEven +2) {
				iSum = iSum + iEven;
			}
		} else {
			for(int iOdd = 1; iOdd <=iNum; iOdd = iOdd +2) {
				iSum = iSum + iOdd;
			}
		}
		
		System.out.println("결과 값 : " + iSum);
		
		sc.close();

	}

}
