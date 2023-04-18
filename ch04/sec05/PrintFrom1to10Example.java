package ch04.sec05;

public class PrintFrom1to10Example {
	public static void main(String[] args) {
	int m , n ;
	
	for(m=2; m<10; m++) {
		for(n=1; n<=9; n++) {
			System.out.print(m+"x"+n+"="+String.format("%2d", m*n) + "   ");
		}
	}
	
	}

}
