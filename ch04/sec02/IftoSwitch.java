package ch04.sec02;

import java.util.Scanner;

public class IftoSwitch {
	public static void main(String[] args) {
		Scanner sca =new Scanner(System.in);
		int num , grade;
		//위와같이 한번에 선언도가능하다 
		char hak;
		String jumsu;
		
		while(true) {
		System.out.println("점수를 입력(종료:Q):");
		jumsu=sca.nextLine();
		if(jumsu.equals("Q")) {
			System.out.println("종료");
			 break;
		}else {
			num=Integer.parseInt(jumsu);
			grade=num/10;
		
			switch(grade){ 
			case 9:
				hak='A';
				break;
			case 8:
				hak='B';
				break;
			case 7: 
				hak='C';
				break;
			case 6: 
				hak='D';
				break;
			default:
				hak='F';
			}
		
		System.out.println("당신의학점은"+num+"점이며등급은"+hak+"입니다");
				}
			}

	}
}

