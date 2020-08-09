package day23daytime;

import java.util.ArrayList;
import java.util.List;

public class HomeWork01 {

	public static void main(String[] args) {
		//Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek ekrana basan 
	    //          bir program yaziniz. Varargs kullanmalisiniz.

		kelimeIlkHarf("Ali","Veli","Java","Kolaydir","diyor","sen","ne","düsünüyorsun");
	
	
	}	
	public static void kelimeIlkHarf (String ...str) {
		for(String w:str) {
			System.out.print(w.charAt(0));
		}
		
	}
		
		

	

}
