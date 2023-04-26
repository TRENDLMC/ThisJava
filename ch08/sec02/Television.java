package ch08.sec02;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다");	
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");	
	}
}
