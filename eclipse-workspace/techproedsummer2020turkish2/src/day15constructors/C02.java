package day15constructors;

public class C02 {
	
	 /* 1)class olusturdugumuzda java bizim kesinlikle obje üretecegimizi düsünür
	 * class ile beraber bir constructors olusturur
	 * paremetresiz ürertir
	 * default constructors olarak adlandirilir.
	 * 2)kendimiz herhangir Constructor üretirsek java default constructor 'i iptal eder
	 */
	
	C02 (int i) {
		
	}
	C02 () {  //DEFAUL CONSTRUCTORS BUDUR
		
	}
	

	public static void main(String[] args) {
		
		C02 obj1=new C02(); //hata vermeme sebebi default CONSTRUCTORS 
		
		
		
		
		
		
	}

}
