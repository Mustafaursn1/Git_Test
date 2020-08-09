package day17staticblock;

public class Sb01 {
	
	/*farzedin ki bu class dairenin cevre ve alaninin hesaplayacak
	 * alan=Pi*r*r   cevre =2*pi*r
	 * bu class da pi sayisi her zaman kullanilacaktir.
	 * pi sayisini class üretirken deger atamasi yapmak faydalidir
	 * eger class üretirken bazi variable lara deger atamasi yapilmasini istersek "staticbloc " yapmaliyiz
	 * !!!static block icinde kullanilan her sey static olmalidir 
	 * bu nedenle asagidaki ärnekte pi sayisini static yapmaliliyiz yoksa "compile time error" verir
	 * !!! staticbloc clastaki consructor ve main methoddan  diger bütün methodlardan önce calisiir
	 *  staticbloc class olusturulurken calsisir
	 *  !!!birden cok staticblock varsa  java önce üsttekini calistitirir.
	 *  GENEL KULLANIMDA STATICBLOCK  MAIN METHODUN ÜSTÜNE YAZILIR
	 *  
	 */
	
	static double pi;
	Sb01 ( ) {
		System.out.println("consructor");
	}
	
	
	static {
		
		pi=3.14;
		System.out.println("staticblock ÜSTTEKI");
	}
	

	public static void main(String[] args) {
		
		Sb01 obj1=new Sb01();
		System.out.println(obj1);//sarialt cizgiyi yok etmek icin yazdim
		
	
		System.out.println("main method");
		Sb01 obj2=new Sb01();
		System.out.println(obj2);//sarialt cizgiyi yok etmek icin yazdim
		
	}
	static {
		
		pi=3.14;
		System.out.println("staticblock ASAGIDAKI");
	}
	
	
	

}
