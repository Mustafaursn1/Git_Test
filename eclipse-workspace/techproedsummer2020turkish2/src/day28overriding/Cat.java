package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.sound();//Miyavlarlar
		cat.numOfFoot();//4 Ayaklari var
		cat.myMethod();
		
		
		
		
	}
	@Override
	public void numOfFoot() {
		System.out.println("4 Ayaklari var");
	}
	public void sound() {
		System.out.println("Miyavlarlar");
	}
	@Override
	public Cat myMethod() {
		Animal obj1=new Animal();
		return null;
		
	}

	
}
