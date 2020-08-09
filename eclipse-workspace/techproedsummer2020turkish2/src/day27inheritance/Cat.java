package day27inheritance;



public class Cat extends Mammal{
	
public Cat() {
	super();
	System.out.println("cat");
	
}
	public static void main(String[] args) {
		Cat cat=new Cat();

	}
	public static void meow() {
		System.out.println("miyavlar");
	}
	public static void clean() {
		System.out.println("temizlenirler");
	}
}


