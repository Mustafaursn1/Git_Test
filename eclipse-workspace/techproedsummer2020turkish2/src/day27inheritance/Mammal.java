package day27inheritance;



public class Mammal extends Animal {
	public Mammal () {
		super();
		System.out.println("Mammal");
	}

	public static void main(String[] args) {
		
		Mammal mammal=new Mammal();

	}
public static  void feed() {
	System.out.println("yavrularini beslerler");
	
}
}
