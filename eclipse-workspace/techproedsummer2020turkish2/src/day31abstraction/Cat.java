package day31abstraction;

public class Cat extends Mammel {

	public static void main(String[] args) {
		/*Concrete Class'lar  Parentleri olan abstract class'lardaki 
		 tüm abstract methodlari overriding yapmak zorundalar.Aksi takdirde CTE olusur
		 2)Concrete class'lar Parent'lerdeki concrete method'lari overriding 
		 etmek zorunda degildir.istege baglidir.
		 
		 * 
		 * 
		 */
		
	}

	@Override
	public void asi() {
		System.out.println("Ey Kedi igne ol!!!");
		
	}

	@Override
	public void drink() {
	System.out.println("Su ic");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini besler");
		
	}

}
