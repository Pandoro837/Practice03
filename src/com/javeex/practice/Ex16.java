package com.javeex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int iCheck = 0;
		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int iCount = 1; iCount <= iNum; iCount++) {
			
			if(iCount % 5 == 0) {
				iCheck++;
				iSum = iSum + iCount;
			}

		} 

		System.out.println("5의 배수의 개수 : " + iCheck);
		System.out.println("5의 배수의 합   : " + iSum);
		
		sc.close();

	}

}
