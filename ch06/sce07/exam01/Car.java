package ch06.sce07.exam01;

public class Car {	
	
	
	//필드
	String model=null;
	String company="현대자동차";
	String color=null;
	int maxSpeed=0;
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
