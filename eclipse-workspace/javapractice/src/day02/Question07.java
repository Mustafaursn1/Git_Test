package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		// Kullanıcdan alınan sayının negatif , pozitif yada notr olma 
		//durumunu konrtol eden ternary yazalım
		
		 Scanner scan=new Scanner(System.in);
			
			
			System.out.println("sayi giriniz");
			int s=scan.nextInt();
		
		
		String result= s>0? "pozitif":s==0 ?"nötr":"negatif";
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
