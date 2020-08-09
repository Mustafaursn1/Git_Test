package day21List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
         2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
          İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz. ArrayList’i
           ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
        */
		//remove() methodunun icine tamsayi koyarsaniz Java onu index kabul eder. Bu yuzden elemanlari integer olan bir 
		//listteki elemanlari silmek icin remove() methodunun sadece indexlisini kullanabilirsiniz.
		List<String >  sl1=new ArrayList<>();
		
		sl1.add("A");
		
		sl1.add("C");
		
       sl1.add("E");
		
		sl1.add("F");
		System.out.println(sl1);//[A, C, E, F]
		
		sl1.add("F");
		sl1.add(1, "L");
		System.out.println(sl1);//[A, L, C, E, F, B]
		/*3) set() methodu kullanarak, E’yi D yapınız.
         ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		 */  
		
		sl1.set(3, "D");
		System.out.println(sl1);//[A, L, C, D, F, B]
		
		/*4) remove() methodu kullanarak, F’yi siliniz.
       ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		  */
		System.out.println(sl1.remove("F"));
		
		System.out.println(sl1);
		
     /*5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
      *  ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
    */

      Collections.sort(sl1);
      System.out.println(sl1);//[A, B, C, D, L]
	/*6) contains() methodu kullanarak, L’nin list’de var oldugunu ve
	 *  M’nin list’de var olmadığını doğrulayınız.
	  */
	
	System.out.println(sl1.contains("L"));//TRUE
	System.out.println(sl1.contains("M"));//FALSE
	System.out.println(sl1.size());//5
	System.out.println(sl1.get(0));
	//8) clear() methodu kullanarak, list’deki tum elemanları siliniz.
	
	sl1.clear();
	System.out.println(sl1); //[]
	
	//9) isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
	
	System.out.println(sl1.isEmpty());//true
	
	
	
	
	}

}
