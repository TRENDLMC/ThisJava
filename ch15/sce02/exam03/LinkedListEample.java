package ch15.sce02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEample {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		
		long startTime;
		long endTime;
		
		
		//arraylist 컬렉션에저장하는 시간측정
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
			//add(0,<<은 저장한인덱스이다)
		}
		endTime =System.nanoTime();
		System.out.printf("%-17s %8d ns \n","arraylist걸린시간",(endTime-startTime));
		
		String a=list1.get(0);
		System.out.println(a);
		
		
		//Linkedlist 컬렉션에저장하는 시간측정
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.printf("%-17s %8d ns \n","Linkedlist걸린시간",(endTime-startTime));
	}

}
