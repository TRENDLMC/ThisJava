package ch07.sce02;

public class Phone {
	
	public String model;
	
	public String color;
	
	public Phone() {
		System.out.println("phone 생성");
	}
	

	public Phone(String model, String color) {
		System.out.println("phone(String model, String color)생성");
		//log4j로 위에 출력문을 대체한다 
		this.model = model;
		this.color = color;
	}


	public void bell() {
		System.out.println("벨이울립니다");	
	}
	
	public void sendVioce(String massage) {
		System.out.println("자기:"+massage);	
	}
	public void receiveVoicce(String massage) {
		System.out.println("상대방:"+massage);	
	}
	public void handup() {
		System.out.println("전화를끊습니다");	
	}
	

}
