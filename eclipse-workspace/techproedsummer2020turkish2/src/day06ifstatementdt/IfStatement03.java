package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		
		//kullanicidan bir sayi alin
		// negatif ise negatif yaz
		//pozitif ise pozitif yaz
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		
		int s=scan.nextInt();
		
		if(s>0) {
			System.out.println("sayi pozitif");
			
		}
		
		if(s<0) {
			System.out.println("sayi negatif");
		}
		
		if(s==0) {
			
			System.out.println("sayi nötr");
		}
		
		
		
		scan.close();
		

	}

}
