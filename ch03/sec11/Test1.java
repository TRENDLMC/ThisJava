package ch03.sec11;

public class Test1 {
	public static void main(String[] args) {
		String a= "abc";
		String b= new String("abc");
		
		boolean c= a==b;
		// == 는 번지 값을 비교하기떄문에 같은문자라도 new값을 입력하여 새로운 번지에 입력하였기떄문에 결과값은 false가나온다
		boolean d= a.equals(b);
		//equals 는 번지수를 비교하는것아닌 문자열 자체의 동일성을 검사하기떄문에 true가 나온다
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(c);
		System.out.println(d);
		
	}

}
