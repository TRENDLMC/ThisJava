package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
		int result= data.length();	
		System.out.println("문자수:"+result);
		}catch(NullPointerException e) {
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		e.printStackTrace();
		//예외처리정보를얻는 세가지 방법 getmassage는 예외발생의 이유를 리턴
		//toString 예의발생의 이유와 종류도 리턴한다
		//printStackTrace의경우 이유와종류 발생위치까지 리턴한다 
		}
		catch(Exception e){
			System.out.println(e);
		}finally {
		System.out.println("[마무리실행]");
		}
	}
	
	public static void main(String[] args){
		System.out.println("[프로그램시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램종료]");	
	}
}
