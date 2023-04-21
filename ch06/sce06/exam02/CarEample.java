package ch06.sce06.exam02;

public class CarEample{
	public static void main(String[] args) {
		Car car=new Car();
		
		System.out.println("모델명:"+car.model);
		System.out.println("회사:"+car.company);
		System.out.println("색깔:"+car.color);
		System.out.println("현재속도:"+car.speed);
		System.out.println("최고속도:"+car.maxSpeed);
		// TODO Auto-generated method stub
		
		car.speed=60;
		
		System.out.println("수정된속도:"+car.speed);

	}

}
