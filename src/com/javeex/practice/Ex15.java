package com.javeex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		for(int iDenomi = 1; iDenomi <= iNum; iDenomi++) {
			if(iNum % iDenomi == 0) {
				System.out.println(iDenomi);
			}
		}
		
		sc.close();
		
	}

}
