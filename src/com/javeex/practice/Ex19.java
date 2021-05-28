package com.javeex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		int iChoice;
		int iSum = 0;
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
			
			System.out.println("-----------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			
			System.out.print("선택 > ");
			iChoice = sc.nextInt();
			
			if(iChoice == 4) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			} else {
				switch (iChoice) 
				{
					case 1:
						System.out.print("예금액 > ");
						int iInsert = sc.nextInt();
						
						iSum = iSum + iInsert;
			
						break;
					case 2:
						System.out.print("출금액 > ");
						int iMinus = sc.nextInt();
						
						if (iSum - iMinus >= 0) {
							iSum = iSum - iMinus;
						} else {
							System.out.println("잔고액이 부족합니다.");
						}
					
						break;
					case 3:
						System.out.print("잔고액 > ");
						System.out.println(iSum);
						
						break;
					
					default:
						System.out.println("다시 입력해주세요.");
						break;
				}
			}
			
		}
			
	}

}
