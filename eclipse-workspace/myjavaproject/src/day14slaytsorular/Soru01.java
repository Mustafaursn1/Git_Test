package day14slaytsorular;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/*1) Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin 
		 * ilk harflerini büyük diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		 */
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("ISMINIZI  GIRINIZ");
		 String isim=scan.nextLine();
		 System.out.println("soyisminizi giriniz");
		 String soyIsim=scan.nextLine();
		 
		 
		System.out.println(isim.toUpperCase().substring(0,1)+isim.toLowerCase().substring(1, isim.length())+" "+
				
				(soyIsim.toUpperCase().substring(0, 1)+soyIsim.toLowerCase().substring(1, soyIsim.length())));
		
		scan.close();
	}

}
