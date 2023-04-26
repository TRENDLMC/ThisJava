package ch08.sec04;

public class Audio implements RemoteControl{
	
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if(volume<RemoteControl.MIN_volume) {
			this.volume=MIN_volume;
		}else if(volume>RemoteControl.MAX_volume) {
			this.volume=MAX_volume;
		}else {
			this.volume=volume;
		}
		System.out.println("현재볼륨은"+volume+"입니다");
		
	}

}
