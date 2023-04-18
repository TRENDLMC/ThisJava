package ch04.sec05;

import java.util.Scanner;

public class sdaa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("----아이디 패스워드를 입력하세요----");
		String strId = "";
		String strPwd = "";	
		
		System.out.print("id :");
		strId = scan.nextLine();

		if(!"ezen".equals(strId))
		{
			System.out.println("ID가 틀렸습니다");
			return;
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.print("pwd :");
			strPwd = scan.nextLine();	

			if("12345".equals(strPwd))
			{
				System.out.println("OK");
				break;
			}
			else if(i != 2)
				System.out.println("비밀번호가 틀렸습니다(최대 횟수3회) 횟수:" + (i+1) );
			else {
				System.out.println("Get Out!");
			}
		}
		
		System.out.println();
		System.out.println("프로그램을 종료");

	}

}


