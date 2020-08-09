package day27inheritance;

public class Car extends Vehicle {

	/*super ile parant'ten constructor cagiriken dikkat edin
	 * parent class'da olmayan bir consructor'i super()
ile cagirirsaniz CTE ALIRSINIZ	 * 
	 */
	
	//consructor cagirmalar ister this ister super ile olsun ilk satirda olmali.
	//"sper" ve "this" ayni anda kullanilmaz
	public Car() {
		super(2);
		System.out.println("Car");
	}
	public Car(String name) {
		this();
		System.out.println("CAR");
	}

	public static void main(String[] args) {
		
		Car car=new Car("HONDA");
		
		
		
		

	}

}
