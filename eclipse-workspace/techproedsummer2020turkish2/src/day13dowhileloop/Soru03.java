package day13dowhileloop;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	
		/*Kullanıcıdan uzunluğu çift sayı olan bir String alın ve 
		 * bu String’in ilk yarısını ekrana yazdırın.
   Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("cift sayili charecte'e sahip bir String giriniz");
		String s=scan.nextLine();
		
		
	System.out.println("ilk yari:"+s.substring(0, s.length()/2));
		
		System.out.println("son yari:"+s.substring(s.length()/2));
		
		scan.close();
		
	}

}
