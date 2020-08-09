package day04Scanner;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		//saati saniyyeye ceviriniz
		//not1:saniye*60*60
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("saniyeye cevirmek icin saat giriniz");
		long saat=scan.nextLong();
		System.out.println("Saniye"+saat*60*60);
		
		scan.close();
		
		
		
		
		
		

	}

}
