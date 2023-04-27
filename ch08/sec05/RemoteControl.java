package ch08.sec05;

public interface RemoteControl {
	int MAX_volume=10;
	int MIN_volume=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
			setVolume(MIN_volume);
		}else {
			System.out.println("무음을해제합니다");
		}
	}
	
}
