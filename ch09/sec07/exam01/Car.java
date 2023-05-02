package ch09.sec07.exam01;

import java.util.Optional;

public class Car {
	//필드에 Tire 객체대입
	private Tire tire1=new Tire();
	
	//필드에 익명자식 객체대입
	private Tire tire2=new Tire(){
		public void roll() {
			System.out.println("익명자식 tire 객체 1이 굴러갑니다");
		};
		
	};
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	
	/*---------------------------------------------------------------------*/
	
	//메소드(로컷변수이용)
	public void run2() {
		//로컬변수에 익명 자식객체대입
		Tire tire=new Tire() {
			@Override
			public void roll() {
				System.out.println("익명자식 tire 객체 2가 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	/*---------------------------------------------------------------------*/
	//메소드(매개변수이용)
	public void run3(Tire tire) {
		tire.roll();
		
	}
	
	

}
