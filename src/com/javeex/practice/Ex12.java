package com.javeex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		int iMulty = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int iNum = sc.nextInt();
		
		for(int iCount = 1; iCount <= iNum; iCount++) {
			iMulty = iMulty * iCount;
		}
		System.out.println("결과 값 : " + iMulty);
		sc.close();
	}

}
