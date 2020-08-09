package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		
		
		//KULLANICIDAN SAYI ALIN
		//SAYI >0 ISE POZITIF YAZDIRIN
		//SAYI ==ISE NÖTR YAZ
		//SAYI<0 NEGATIF YAZDIR
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double s=scan.nextDouble();
		
		
		if (s>0) {
			System.out.println("pozitif");
		}
		
		else if(s==0) {
			System.out.println("Nötr");
		}
		
		else  {
			System.out.println("Negatif");
		}
		
	
		scan.close();
		
		
		
		
		
		
		
		
	}

}
