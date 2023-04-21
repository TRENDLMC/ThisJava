package ch06.sce06.exam03;

public class Car {
	//필드
	String model="그랜져";
	String company="현대자동차";
	String color="검은색";
	int maxSpeed=300;
	int speed;
	
	//사용자 오버로딩 
	Car(String model){
		this.model=model;
		}
	Car(String model,String color){
		this.model=model;
		this.color=color;
		}
	Car(String model,String color,int speed){
		this.model=model;
		this.color=color;
		this.speed=speed;			
		}
}
