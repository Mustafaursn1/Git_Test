package day03;

import java.util.Scanner;

public class UstAlma {

	public static void main(String[] args) {
		
		/*kullanicidan iki sayi aliniz
		 * 1.sayi taban 2.sayi üst
		 * 1.sayinin üssünü hesaplayiniz
		 */
		
		
		  Scanner scan=new Scanner(System.in) ;
		  
		System.out.println("iki sayi giriniz");
		int taban=scan.nextInt();
		int üss=scan.nextInt();
	
		long sonuc=1;
		while (üss!=0) {
			sonuc*=taban;
			üss--;
		}
		
		
	System.out.println("cevap:"+sonuc);
		
		 scan.close();
	}

}
