package ch02.sec01;

public class VariableInttializationExample {
	public static void main(String[] args) {
	
		int value;
		value =0;
		//변수 value선언 int 타입의 초기값인 0읋 넣어 초기화해준다 
		int result = value+10;
		//변수 result 선언후 value+10의값을 초기값을 저장
		System.out.println(result);
		//변수 result를 읽고 콘솔에출력
		
		int hour=3;
		int minute=5;
		System.out.println(hour+"시간"+minute+"분");
		
		System.out.println("총"+((hour*60)+minute)+"분");
}

}
