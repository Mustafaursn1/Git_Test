package day31abstraction;

public abstract class Animal {
	
	/*1)abstract==>soyut demektir,zit anlamlisi  "concrete"==>somut demektir.
	  2)abstract class'lardan object  üretilemez.cunku object concrete(somuttur)
	   abstract class ise abstract(soyuttur)
	  3)abstract class olusturarark child class'lari bazi seyleri yapmaya mecbur kilariz.
	  abstract class icierisinde olusturulan abstract method'lar child class'lar 
	  tarafindan uygulamnmak zorundadir
	  concrete class'larin icine abstract method konulmaz.
	  4)abstract class'lar icine abstract olmayan methodlar yazilabilir==>concrete method 
	  bu methodlar child class'lar tarafindan istefe bagli kullanabilir.
	  abstract method'a abstract yailmak zorunda concrete method'da "concrete" yazilmaz
	  abstract class'lar child class'larin "to do" listini verir.
	  5)abstract cullandiysaniz body kullanmaman gerekir.
	  
	 */
	
	
	public abstract void asi() ;
	public abstract void drink();
		public void yemek () {
			System.out.println("Yemek yerler");
		}
	
	

}
