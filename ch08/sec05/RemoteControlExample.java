package ch08.sec05;

public class RemoteControlExample {
public static void main(String[] args) {
	RemoteControl rc;
	rc= new Television();
	
	rc.turnOn();
	rc.turnOff();
	rc.setVolume(5);
	rc.setVolume(30);
	rc.setVolume(-4);
	rc.setMute(true);
	rc.setMute(false);
	
	rc= new Audio();
	
	rc.turnOn();
	rc.turnOff();
	rc.setVolume(5);
	rc.setVolume(30);
	rc.setVolume(-4);
	
}
}
