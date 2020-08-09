package day03;

import java.util.Scanner;

public class UstAlmaMathematikYöntemi {

	public static void main(String[] args) {
		
		

		  Scanner scan=new Scanner(System.in) ;
		  
		System.out.println("iki sayi giriniz");
		int taban=scan.nextInt();
		int üss=scan.nextInt();
		double sonuc=1;
		
		sonuc=(long)Math.pow(taban, üss);
		System.out.println(sonuc);
		
		
		scan.close();
		
		
		
	}

}
