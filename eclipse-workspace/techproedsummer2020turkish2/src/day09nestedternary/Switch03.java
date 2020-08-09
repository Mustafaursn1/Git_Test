package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		/*kullanicidan ay numarasini alin
		 * ay numarasi girince  sonraki tüm aylari n isimlerini ekrana yazdir
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ay icin 1 numara giriniz");
		
		int ay=scan.nextInt();
		
		
		
		switch (ay) {
		case 1:
			System.out.println("ocak");
		case 2:
			System.out.println("subat");
		case 3:
			System.out.println("mart");
		case 4:
			System.out.println("nisan");
		case 5:
			System.out.println("mayis");
		case 6:
			System.out.println("haziran");	
			
		case 7:
			System.out.println("temmuz");
		case 8:
			System.out.println("agustos");
		case 9:
			System.out.println("eylül");
		case 10:
			System.out.println("ekim");
		case 11:
			System.out.println("kasim");
		case 12:
			System.out.println("aralik");	
			break;
			
		default :
			System.out.println("gecersiz ay sayisi");
			switch(ay) {
			
			
			}
			
			}
		
		
		//break yazmadigimizda hangi ayi girersek sonuna kadar yazdiracak
		
		
		scan.close();
		
		
		

	}

}
