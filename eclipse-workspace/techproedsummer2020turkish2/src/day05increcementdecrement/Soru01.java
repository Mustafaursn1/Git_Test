package day05increcementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	
		
		
		//1SAYILARI KULLANICIDAN ALINIZ
		//IKI TANE INT VARUANALE OLUSTURUN A=5 VE B=3
		//SONRA BU IKI INT LARIN DEGERLERININ YERLERINI DESGISTIRIN
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.sayiyi giriniz");
		int s1=scan.nextInt();
		System.out.println("2.sayiyi giriniz");
		int s2=scan.nextInt();
		System.out.println(s1+" "+s2);
		
		int bos=0;
		bos=s1;
		System.out.println(s1+" "+bos +" "+s2);
		
		s1=s2;
		System.out.println(s1+" "+bos+" "+s2);
		s2=bos;
		System.out.println(s1+" "+bos+" "+s2);
		
		
		
		scan.close();
		
		

	}

}
