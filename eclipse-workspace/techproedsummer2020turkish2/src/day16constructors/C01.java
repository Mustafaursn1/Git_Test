package day16constructors;

public class C01 {
	
	int i=12;//intance variable obje variable da dedir
	/*objelere asilir
	 * 
	 */
	static int k=12; //static variable ...Class variable 
	/*1.class aasilir
	 * static variable her objenin  variable'dir
	 * 
	 */
	

	public static void main(String[] args) {
		/*static variable Classlara aittir bunun icin"Class VARIABLE " DA DENIR
		 * intance Variabable objelere aittir object variable denir
		 *!! static variable daki degisiklikler kim tarafindan yapilirsa 
		 * yapilsin bütün objeler tarafindan görülür
		 * !!intance variable da degisiklikler sadece o intance variable 
		 * hangi objeje ait ise onun tarafindan görülür
		 * static variable class lar olustirilurlken java tarafindan olusturulur
		 * intance variabler ise object ler olusturulutrkne  olusturulur
		 * 1 class  class icinde  1tane static ve 1 tane de intance var
		 * 10 tane object olusturdugumuzda 1 tane static variable 10 tane intance varioble olusturulur
		 */
		
		
		
		C01 obj1=new C01();
		obj1.i=20;
		obj1.k=30;
		
		System.out.println(obj1.i);//20
		C01 obj2=new C01();
		System.out.println(obj2.i);//12
		System.out.println(obj2.k);
		
		
		
		
		

	}

}
