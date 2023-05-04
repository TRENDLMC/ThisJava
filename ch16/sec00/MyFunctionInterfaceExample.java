package ch16.sec00;

public class MyFunctionInterfaceExample {
public static void main(String[] args) {
		
		MyFunctionInterface fi;
		
		fi = () ->{
			String str = "method call1";
			System.out.println(str);
		};
		//인스턴스 재정의
		
		System.out.println();
		
		fi.method();
		//메소드호출
		
		
		
		fi = () ->{System.out.println("method call2");};
		//위에서 정의한것을 재정의한다  
		fi.method();
		
		fi = () -> System.out.println("method call3");
		//명령어가 한줄이라 괄호를 생략한다
		fi.method();

	}

}
