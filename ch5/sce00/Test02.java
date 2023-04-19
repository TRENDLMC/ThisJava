package ch5.sce00;

import java.util.Scanner;

public class Test02 {
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
	public static void main(String[] args) {
	  Scanner sca=new Scanner(System.in);
	  System.out.println("3개의 정수릉 입력하십시오");
	  System.out.print("1:");
	  int a= sca.nextInt();
	  System.out.print("2:");
	  int b= sca.nextInt();
	  System.out.print("3:");
	  int c= sca.nextInt();  
	  System.out.println("최대공약수"+fun(a,b,c));
	
	}
       
	}
	