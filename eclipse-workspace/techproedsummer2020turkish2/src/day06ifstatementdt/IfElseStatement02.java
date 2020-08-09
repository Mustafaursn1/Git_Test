package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		//kullanicidan sayi al
		//bu syi  10 dan 100 e kadar ise iki basamakli yaz
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
				
		int s=scan.nextInt();
		
		if(s>=10&&s<=99) {
			System.out.println("iki basamakli");
		}
		
		else { 
			System.out.println("iki basamkli degil");
		}
		
		
	
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
