package ch03.sec09;

public class BitlogExample2 {
	public static void main(String[] args) {
		int value=772; 
		
		byte byte1=(byte)(value>>>24);
		int int1=byte1 & 255;
		System.out.println("첫 번쨰 바이트 부호없는값:"+int1);
		
		
		byte byte2=(byte)(value>>>16);
		System.out.println("첫 번쨰 바이트 부호없는값:"+int1);
	}

}
