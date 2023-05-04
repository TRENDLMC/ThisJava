package ch16.sec03;

public class LamdaExample {
	public static void main(String[] args) {
		Person person=new Person();
		
		person.action1((name,job)->{
			System.out.print(name+"이");
			System.out.println(job+"을합니다");
		});
		
		person.action1((name,job)->System.out.println(name+"이"+job+"을하지않습니다"));
		
		
		person.action2(word->{
			System.out.print("\""+word+"\"");
			System.out.println("라고말합니다");
		});
		//매개변수가 하나라서 ()을 생략한뒤입력
		person.action2(word->System.out.println("\""+word+"\"라고외칩니다"));
		//명령문이 하나일경우 중괄호{}를 생략한뒤입력 
	}

}
