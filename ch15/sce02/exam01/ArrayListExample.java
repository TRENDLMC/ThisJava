package ch15.sce02.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<Board> list=new ArrayList<>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		//객체의인덱스 총객체수를 알기
		//페이지의 기준에따라 페이지수를구성할떄 사용할수있다
		
		int size=list.size();
		System.out.println("총객체수"+size);
		System.out.println();
		
		//상세보기
		Board board=list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println();
		
		//목록보기 
		for (int i = 0; i < list.size(); i++) {
			Board b=list.get(i);
			System.out.println(b.getSubject());
			
		}
		System.out.println();
		
		//객체삭제
		//높은번호의 인덱스부터 삭제하는것이 정확도가높다 
		list.remove(2);
		list.remove(2);
		
		//향상된for문사용하여 객체가져오기 
		for(Board b:list){
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		}
	}

}
