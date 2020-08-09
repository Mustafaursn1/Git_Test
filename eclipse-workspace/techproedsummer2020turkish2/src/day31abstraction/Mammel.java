package day31abstraction;

public abstract class Mammel extends Animal {
	
	/*1)Goruldugu gibi Mammel, Animal'in child class'i asi() methodu ile drink() methodunu 
	 * override etmedi ama herhangi bir cte yok
	 * cunku abstract child'larin abstract parent'teki abstract method'lari
	 * override etme zorunlulugu yoktur.
	 *  
	 * 
	 * 
	 */
	public abstract  void feed();
	public void move() {
		System.out.println("Hareket eder");
	}

}
