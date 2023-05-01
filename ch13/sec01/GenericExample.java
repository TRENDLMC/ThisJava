package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1=new Box<>();
		//제네릭에 string타입을 대입해줘서 문자열을 저장할수있는 객체를 생성해줌
		
		box1.content="안녕하세요";
		String str=box1.content;
		System.out.println(str);
	
	
		
		Box<Integer> box2=new Box<>();
		//제네릭에 Integer 타입을 대입해줘서 정수를 저장할수있는 객체를 생성해줌
		box2.content=100;
		int value=box2.content;
		//강제타입변화를 해주지않아도 값이대입할수있다 
		
		System.out.println(value);
		
		Box box=new Box();
		box.aaa="안녕하세요";
		String str2=(String)box.aaa;
		System.out.println(str2);
		//오브젝트를 사용한경우 오브젝트타입으로변환된다 타입을 지정하지않아도 제네릭은 오브젝트로저장된다
		//오브젝트는 강제타입변환을 해줘야 string으로 대입이된다 
		
	}

}
