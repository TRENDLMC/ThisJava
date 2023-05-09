package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		
	
	List<Studunt> list= Arrays.asList(
			new Studunt("홍길동",10),
			new Studunt("신용권",20),
			new Studunt("유미선",30)
			);
		
		//파이프라인사용전
		Stream<Studunt> studuntStream=list.stream();
		IntStream scoreStream= studuntStream.mapToInt(studunt ->studunt.getScore());
		double avg=scoreStream.average().getAsDouble();
		
		//파이프라인사용후 아래방식을 사용하는것이 좋다.
		double avg1=list.stream()
				.mapToInt(studunt->studunt.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균점수:"+avg);
		System.out.println("평균점수:"+avg1);
	}
}
