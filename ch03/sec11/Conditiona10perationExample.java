package ch03.sec11;

import java.util.Scanner;

public class Conditiona10perationExample {
	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);

		

		
	//	char grade=(score> 90)? 'A':((score>80)?'B':'C');
		while(true){
			System.out.print("점수를 입력해 주십시오");	
			String esc=sca.nextLine();
		if(esc.equals("q")||esc.equals("Q")) {
			System.out.println("종료합니다");
			break;
			}
		else {
		String s;
		int score =Integer.parseInt(esc);
					if(score>90) {
						s="A";
		        	
					}else if(score>80) {
						s="B";
					}
					else if(score>70) {
						s="C";
					}else if(score>60) {
						s="D";
					}else{
						s="F";
					}
					System.out.println(score +"점은"+s+"등급입이다");
					continue;
					}
		}	
	}
		
}




