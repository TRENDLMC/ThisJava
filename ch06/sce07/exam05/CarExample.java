package ch06.sce07.exam05;

public class CarExample {
	public static void main(String[] args) {	
		Car car1= new Car("자가용");
		System.out.println("car2company:"+car1.company);
		System.out.println("car2modle:"+car1.model);
		System.out.println("car3color:"+car1.color);
		System.out.println();
		
		Car car2= new Car("자가용","빨강");
		System.out.println("car3company:"+car2.company);
		System.out.println("car3modle:"+car2.model);
		System.out.println("car3color:"+car2.color);
		System.out.println();
		
		Car car3= new Car("택시","검정",200);
		System.out.println("car4company:"+car3.company);
		System.out.println("car4modle:"+car3.model);
		System.out.println("car4color:"+car3.color);
		System.out.println("car4maxSpeel:"+car3.maxSpeed);
		
		System.out.println(car3.toString());
		
		
	}

}
