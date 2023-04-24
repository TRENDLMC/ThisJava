package ch06.sec05;

import java.util.Scanner;

public class Java_jinsu {
    
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
	 System.out.print("십진수를 입력하십오:");
		int jin=sca.nextInt();
		
		System.out.println("10진수는"+jin);
		System.out.println("2진수는"+Integer.toBinaryString(jin));
		System.out.println("8진수는"+Integer.toOctalString(jin));
		System.out.println("16진수는"+Integer.toHexString(jin));
}
}
