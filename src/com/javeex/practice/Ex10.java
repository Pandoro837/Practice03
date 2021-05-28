package com.javeex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int iNum, iNumM;
		iNumM = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		for(int iCount = 0; iCount < 5; iCount++) {
			System.out.print("숫자 : ");
			iNum = sc.nextInt();
			
			if(iNum > iNumM) {
				iNumM = iNum;
			}
			
		}
		System.out.println("최대 값은 " + iNumM + "입니다.");
		
		sc.close();
		
	}

}