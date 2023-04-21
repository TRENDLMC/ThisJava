package ch06.sce07.exam01;

public class CarExample{
	public static void main(String[] args) {

	Car car=new Car("G80");
	
	System.out.println("모델명:"+car.model);
	System.out.println("차색상"+car.color);
	System.out.println("현재속도:"+car.speed);
	}

}
