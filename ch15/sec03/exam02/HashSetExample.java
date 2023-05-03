package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java");//중복값인 java는 저장되지않음
		set.add("Spring");
		
		int size=set.size();
		System.out.println("총 객체수:"+size);
	}
}
