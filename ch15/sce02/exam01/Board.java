package ch15.sce02.exam01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Board {
	
	private String subject; //제목
	private String content;//내용
	private String writer;//작성자
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	

}
