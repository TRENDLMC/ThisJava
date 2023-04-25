package ch07.sce02;

public class SmartPhoneExample {

	public static void main(String[] args)  {
		SmartPhone myPhone= new SmartPhone("갤럭시","검은색");
		
		System.out.println("모델:"+myPhone.model);
		System.out.println("색상:"+myPhone.color);
		
		System.out.println("와이파이상태"+myPhone.wifi);
		myPhone.internet();
		myPhone.bell();
		myPhone.sendVioce("여보세요");
		myPhone.receiveVoicce("안녕하세요 저는 홍길동인데요.");
		myPhone.sendVioce("아~네 반갑습니다");
		myPhone.handup();
		myPhone.setWifi(true);
		myPhone.internet();
		
		
	}
}
