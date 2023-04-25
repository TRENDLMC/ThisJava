package ch07.sce04.exam01;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("computer 객체 areaCircle()실행");
		System.out.println("calculator결과"+super.areaCircle(r));
		return Math.PI*r*r;
	}

}
