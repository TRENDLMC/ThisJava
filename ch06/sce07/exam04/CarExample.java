package ch06.sce07.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car car1= new Car();
		System.out.println("car1company:"+car1.company);
	
		
		System.out.println();
		
		Car car2= new Car("자가용");
		System.out.println("car2company:"+car2.company);
		System.out.println("car2modle:"+car2.model);
		System.out.println();
		
		Car car3= new Car("자가용","빨강");
		System.out.println("car3company:"+car3.company);
		System.out.println("car3modle:"+car3.model);
		System.out.println("car3color:"+car3.color);
		System.out.println();
		
		Car car4= new Car("택시","검정",200);
		System.out.println("car4company:"+car4.company);
		System.out.println("car4modle:"+car4.model);
		System.out.println("car4color:"+car4.color);
		System.out.println("car4maxSpeel:"+car4.maxSpeed);
		
	}

}
