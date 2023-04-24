package ch05.sce00;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	 int retry;
	 
 do {
	Scanner sca=new Scanner(System.in);
	System.out.println("----------------------------");
	System.out.println("|1번 지정약수구하기| 2번 최대공약수|");
	System.out.println("----------------------------");
	System.out.print("실행할 프로그램을 선택해주세요");
	int en=sca.nextInt();
	
	if(en==1) {
	System.out.print("약수를구할 대상의 정수를 입력하십시오:");
	int x= sca.nextInt();
	System.out.print("몇번쨰 약수를 구할것인지 입력하십시오:");
	int y= sca.nextInt();
	
	int result=fun1(x,y);
	if(result==-1) {
		System.out.println("해당정수의"+y+"약수는 없습니다");
	}else System.out.println( y+"번쨰 약수:"+result);
	}else if(en==2) {
		System.out.println("3개의 정수릉 입력하십시오");
		  System.out.print("1:");
		  int a= sca.nextInt();
		  System.out.print("2:");
		  int b= sca.nextInt();
		  System.out.print("3:");
		  int c= sca.nextInt();  
		  System.out.println("최대공약수"+fun(a,b,c));
		}else {}
	System.out.println("재실행 하시겠습니까? 1.재실행 2.종료");
	retry=sca.nextInt();
	if(retry==2) {
		System.out.println("종료합니다");
		System.exit(1);
	}
	
 }while(retry==1);
}

public static int fun1(int number, int k) {
	 for(int i=1;i<=number;i++) {
		 if(number % i ==0) {
			 k--;
			 if(k==0) {
				 return i;
			 }
		 }
	 }
	 return -1;
}
static int fun(int a, int b, int c) {
		int min=0;
		if(a>b) {
			if(b>c) {
				min=c;
			}else {
				min=b;
			}
			
		}else {
			if(a>c) {
				min=c;
			}else {
				min=a;
			}
		}
		for(int i=min;i>0; i--) {
			if(a%i==0 && b%i==0 &&c%i==0) {
				return i;
			}
		}
		return -1;
	}
}
