package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.sonde();
		Cat cat=new Cat();
		cat.sonde();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sonde();
	}

}
