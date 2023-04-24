package ch06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		
	
	
	Calculator cal=new Calculator();
	
	double z= cal.areaRectangle(10);
	double z1= cal.areaRectangle(10,20);
	System.out.println("정사각형z의값넓이"+z);
	System.out.println("직사각형z1의넓의:"+z1);
	
	Triangle tri= new Triangle();
	
	double t1= tri.Triangle(6.5, 3.5);
	System.out.println("삼각형의넓이:"+t1);
	

	}
}
