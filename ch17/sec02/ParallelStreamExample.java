package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {


	public static void main(String[] args) {
		List<String> list= new ArrayList<>();	
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("람다식");
		list.add("김병렬");
		
		
		Stream<String> parallelstream=list.parallelStream();
		parallelstream.forEach(name->{
			
	System.out.println(name+":"+Thread.currentThread().getName());
	});
		//parallelstream 병렬처리명령어 
		//currentThread().getname 처리하는 스레드의 이름 
	}
}
