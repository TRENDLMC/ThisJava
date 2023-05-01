package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array= {"100","1oo",null,"200"};
		
		for (int i = 0; i <= array.length; i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array{"+i+"]:"+array[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열인덱스가 초과됨:"+e.getMessage());
			}catch(NumberFormatException|NullPointerException e) {
			//3개는안됌
				System.out.println("데이터에 문제가있습니다"+e.getMessage());
				
			}
		}
	}
}