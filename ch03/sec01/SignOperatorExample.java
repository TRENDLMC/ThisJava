package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int i=5;
		
		int sum =++i + i++;
		// 6+ 6 계산후 뒤에++는 7로만듬
		//부호가 앞에있으면 전위연산자 일반연산자보다 먼저 계산됨
		//부호가 뒤에있으면 후위연산자 일반연산자의 계산이 끝난뒤 계산됨
		
		
		System.out.println(i);
		System.out.println(sum);
						
	}
}
