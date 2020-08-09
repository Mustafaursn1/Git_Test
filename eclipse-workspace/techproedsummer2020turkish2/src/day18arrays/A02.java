package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		//iki array olusturunuz
		//length'leri ayni olsun
		//iki array'in elemanlari ayni ise ekrna "ayni" degilse "farkli " yazdirin(--loop kullaniniz)
		
		char ch1[]= { 'a','b','g','k',};
		char ch2[]= { 'a','b','k','c'};
		//1.YOL
		int z=0;
		for(int i=0;i<ch1.length;i++) {
			if (ch1[i]==ch2[i]) {
				z++;
				
		}
		}
		if(z==ch1.length) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni Degil");
		}
		
		
		//2.YOL
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Ayni");
		}else {
			System.out.println("Ayni Degil");
		}
		
		
		
		
	}

}
