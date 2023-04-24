package ch06.sce07.exam02;

public class KoreanExampl {
	public static void main(String[] args) {
		
	Korean k1= new Korean("박자바","123456-1234567");		
	
	System.out.println("k1국적"+k1.nation);
	System.out.println("k1이름"+k1.name);
	System.out.println("k1주민번호"+k1.ssn);
	
	Korean k2= new Korean("김자바","930525-0654321");
	
	System.out.println("k2국적"+k2.nation);
	System.out.println("k2이름"+k2.name);
	System.out.println("k2주민번호"+k2.ssn);
	}
	

}
