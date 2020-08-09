package day30;

public class TryCatc01 {

	public static void main(String[] args) {
		//try'dan sonraistedigimiz kadar catch kulalanabiliriz
		//sartimiz yukardaki catch herzaman alttakinin child'i olmali
		//finally {} block exception olsa da olmasa da calsir
		//finally {} block try-catch 'ten sonra kullanilir
		//!!!!finally {} block interview sorusudur
		//interview:final,finally, finalize keyword'lerin farki nedir?
		/*1.)finally{}==>
         try-catch block'tan sonra kullanilir
         exception olsa da olmasa da calisir	
         2.)final==>Variable'larda final kullanilirsa o variable'in degeri degistirilemez
         mesela pi sayisi  final  yapildigi  zaman degeri degistirilemez.final String 
         code ="POS";
         	  
         	  Method'larda final kullanilirsa , method body'leri degistirilemez.
         	  dolayisiyla overririding yapilamaz
         	  
         	  Class'larda final kullanilirsa o class extend edilemez.
         	  yani inheritance mümkün degildir
         	  
         	  public  final class Animal{}===public class Dog extends Animal{}
olmaz
       3.)finalize()==>finalize() methodu,
        Garbage collector'im imha edecegi datalari imha edilecek  hale getiriri
         */ 	  
         	  
		
		
	int num1=12;
	int num2=0;
	try {
		System.out.println(num1/num2);
	} catch (ArithmeticException e) {
		System.out.println("sifir ile bölme yapilmaz");
		
	}finally {
		System.out.println("Aferin sana");
	}
		
		
		
		
		
		
	}

}
