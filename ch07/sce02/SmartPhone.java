package ch07.sce02;

public class SmartPhone extends Phone{
	public boolean wifi;
	

	

	public SmartPhone(String model,String color) {
		super(model, color);
		System.out.println("스마트폰 생성자");
		this.model=model;
		this.color=color;
	}
	
	public  void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경했습니다");
	}
	
	public void internet() {
		if(this.wifi ==true) {
		System.out.println("인터넷을 연결합니다");	
	}else {
		System.out.println("인터넷이 연결되어있지않습니다");
	}

	}
}
