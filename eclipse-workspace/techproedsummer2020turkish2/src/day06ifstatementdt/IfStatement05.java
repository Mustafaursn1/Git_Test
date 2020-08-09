package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
	
	//sayi alin
		//0dan 9 a kadar ise rakam yazdir
		//9dan büyük veya 0dan kücükse sayi yadir
		//  || veya 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
				
		int s=scan.nextInt();
		
		if(s>=0&&s<=9) {
			
			System.out.println("rakam");
			
			
		}
		
		
		if(s<0||s>9) {
			System.out.println("sayi");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
