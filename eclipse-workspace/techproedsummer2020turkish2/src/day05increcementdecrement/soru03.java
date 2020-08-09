package day05increcementdecrement;

import java.util.Scanner;

public class soru03 {

	public static void main(String[] args) {
	
		
		//kullanicidan 3 basamakli sayi aliniz
		//bus sayinin rakamlari toplamini ekrana yazdiriniz
		//modulus ile ilgili
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("3 basamakli sasi söyleyiniz");
		int s=scan.nextInt();
		
		int sonRakam=s%10;
		
		int ortaRakam=(s/10)%10;
		int ilkRakam=(s/100)%10;
		
		System.out.println(sonRakam+ortaRakam+ilkRakam);
		
		scan.close();
		
		
		
	
		
		
		
		
		
		

	}

}
