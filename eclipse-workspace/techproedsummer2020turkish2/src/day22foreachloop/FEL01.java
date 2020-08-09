package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		List<Integer> il=new ArrayList<>();
		
		il.add(21);
		il.add(22);
		il.add(23);	
		il.add(24);
		il.add(25);
		il.add(26);	
		
		//for-each loop=Enhanced(zenginlestrilmis)
		//!!! array'larde kullanilmaz
		for(Integer w:il) {
			System.out.print(w+" ");
			
		}
		
		//il List'inin tüm elemanlarini toplayiniz
		int sum=0;
		for(Integer w:il) {
			sum=sum+w;
			
		}
		System.out.println();
		System.out.println(sum);//66
		
		
		
		//il List'inin icindeki tek sdayi elemanlarin carpimini bul
		int product=1;
		
		for(Integer w:il) {
			if(w%2!=0) {
				product=product*w;
				
			}
		}
		System.out.println(product);//483
		////il List'inin icindeki tek sdayi elemanlarin yazdirin
		
		
		for(int w:il) {
			if(w%2!=0) {
				System.out.print(w +" ");
			}
		    }
		
		//break ve continie karsilastirma
		//il list'inin ilk 3 elemanini yazdiriniz
		System.out.println();
		//1.yol
		int count=0;//flag
		
		for(int w:il) {
		if(count<3) {
			System.out.print(w +" ");//21 22 23 
			count++;
		}
		}		
		System.out.println();
		//2.yol
		 
		int c=0;
		for (int w:il) {
			System.out.print(w +" "); //21 22 23 
			c++;
			if(c==3) {
				break;
			}
				
		}
		System.out.println();
			
		//il  List'inde 3 ile bölinenleri ekrana yaz
		//1.yol
		for (int w:il) {
			if(w%3==0) {
				System.out.print(w+" ");//21 24 
				
			}
		}
		System.out.println();
		//2.yol
		
		int z=0;
		for (int w:il) {
			if(w%3!=0) {
				continue;
			}
				System.out.print(w+" ");//21 24 
		}
			
	
		
		
		
		
		
}

}
