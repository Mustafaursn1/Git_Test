package day03;

import java.util.Scanner;

public class UsAlmaForLop {

	public static void main(String[] args) {

		  Scanner scan=new Scanner(System.in) ;
		  
		System.out.println("iki sayi giriniz");
		int taban=scan.nextInt();
		int üss=scan.nextInt();
	
		long sonuc=1;
		
		
		for(;üss !=0;üss--) {
			sonuc*=taban;
			
		}
		
		System.out.println("cevap:"+sonuc);
		scan.close();

	}

}
