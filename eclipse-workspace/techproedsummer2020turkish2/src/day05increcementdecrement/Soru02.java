package day05increcementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1SAYILARI KULLANICIDAN ALINIZ
				//IKI TANE INT VARUANALE OLUSTURUN A=5 VE B=3
				//SONRA BU IKI INT LARIN DEGERLERININ YERLERINI DESGISTIRIN
		
		//variable olusturmadan
				
				Scanner scan=new Scanner(System.in);
				System.out.println("1.sayiyi giriniz");
				int s1=scan.nextInt();
				System.out.println("2.sayiyi giriniz");
				int s2=scan.nextInt();
				System.out.println(s1+" "+s2);
				
				s1=s1+s2;
				s2=s1-s2;
				s1=s1-s2;
				
				System.out.println(s1+" "+s2);
				scan.close();
	
	
	
	
	
	
	
	
	}

}
