package ch08.sec04;

public interface RemoteControl {
	int MAX_volume=10;
	int MIN_volume=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
