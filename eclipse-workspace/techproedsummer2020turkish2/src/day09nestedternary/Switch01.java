package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf alin
		 Harf 'a' veya 'A' ise ekrana "Ilk harf" yazdirin 
		 Harf 'b' veya 'B' ise ekrana "Ikinci harf" yazdirin
		 Harf 'c' veya 'C' ise ekrana "Ucuncu harf" yazdirin
		 Diger durumlarda ekrana "Tanimlanamadi" yazdirin
		 
		 */
		//1.yol
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char ch=scan.next().charAt(0);
		
		if (ch=='a'|| ch=='A') {
			System.out.println("ILK HARF");
		}else if(ch=='b'|| ch=='B') {
			System.out.println("2.HARF");
		}else if(ch=='c'|| ch=='C') {
			System.out.println("3.HARF");
		}else {
			System.out.println("tanimlanamadi");
		}
		//2.yol
		switch(ch) {
		case 'a':
			System.out.println("ilk harf");
			break;
		case 'A':
			System.out.println("ilk harf");
			break;
		case 'b':
			System.out.println("2.harf");
			break;
			
		case 'B':
			System.out.println("2.harf");
			break;
		case 'c':
			System.out.println("3.harf");
			break;
		case 'C':
			System.out.println("3.harf");
			break;
			
		default :
			System.out.println("Tanimlanamadi");
			
			}
		
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
