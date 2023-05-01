package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		//K는 tv로 대입m은 String을 대입했음 
		Product<Tv,String> product1=new Product<>();
		
		//set명령어를 이용하여 tv와 String의 값을 제공함 
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		// tv와 String타입을 선언해서 값을 private값을 받아옴 
		Tv tv=product1.getKind();
		String tvModel=product1.getModel();
		
		Product<Car,String> product2=new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUB자동차");
		
		Car car=product2.getKind();
		String carmodel=product2.getModel();		
	}

}
