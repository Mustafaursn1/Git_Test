package day13dowhileslaytsoeular;

import java.util.Scanner;

public class DoWhilesoru04 {

	public static void main(String[] args) {
		
		/*Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana
		 *  “Kare oluşturdunuz” yazdırın. Eşit değilse tekrar iki sayı girmesini söyleyin.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		
	do {
		System.out.println("ikis sayi giriniz");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
			
	}while(num1!=num2);{
		System.out.println("kare olusturunuz");

scan.close();

	}






	}

}
