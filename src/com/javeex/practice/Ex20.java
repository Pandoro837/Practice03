package com.javeex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int iRandom = (int)(Math.random() * 100 +1);
		
		System.out.println("==============================");
		System.out.println("   [숫자 맞추기 게임 시작]");
		System.out.println("==============================");
		
		while(true) {
			System.out.print(">> ");
			int iNum = sc.nextInt();
			
			if (iNum == iRandom) {
				sc.nextLine();
				System.out.println("맞았습니다.");
				
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				String sRestart = sc.nextLine();
				
				if(sRestart.equals("y")) {
					
					System.out.println("==============================");
					System.out.println("   [숫자 맞추기 게임 종료]");
					System.out.println("==============================");	
					
					sc.close();
					
					break;
				} else {
					iRandom = (int)(Math.random() * 100 +1);
				}
				
			} else {
				if (iNum > iRandom) {
					System.out.println("더 낮게");
				} else {
					System.out.println("더 높게");
				}
			}
	
		}
		
	}

}
