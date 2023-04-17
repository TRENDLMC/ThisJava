package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x의값 입력: ");
		String strX= scanner.nextLine();
		int x= Integer.parseInt(strX);
		
		System.out.print("y의값 입력: ");
		String strY= scanner.nextLine();
		//스캐너에서들어오는것이 문자열일경우 문자열그대로사용할것아니면 파싱과정을 거쳐야한다
		//강제타입변환 문자열을 숫자로변경하는 과정 
		int y= Integer.parseInt(strY);
		
		
		int result =x+y;
		System.out.print("x+y의값:"+result);
		System.out.println();
		
		while(true) {
			// while(true) 의 
			System.out.print("입력문자열:");
			String data=scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력문자열:"+data);
			System.out.println();
		}
		System.out.println("시스템 종료");
		
		
		
	}

}
