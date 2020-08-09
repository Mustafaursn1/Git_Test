package day27inheritance;



public class Dog extends Mammal {
	public boolean loyal=true;
	public Dog() {
		super();
		System.out.println("Dog");
	}

	public static void main(String[] args) {
		Dog dog=new Dog();
		
		day26passbyvalueinheritance.Dog.smell();
		day26passbyvalueinheritance.Dog.bark();
		day26passbyvalueinheritance.Dog.feed();
		day26passbyvalueinheritance.Dog.drink();
		day26passbyvalueinheritance.Dog.eat();
		
	
		
		

	}
	public static void bark() {
		System.out.println("Kopekler havlarlar");
	}
public static void smell() {
	System.out.println("iyi koku alirlar");
}
}
