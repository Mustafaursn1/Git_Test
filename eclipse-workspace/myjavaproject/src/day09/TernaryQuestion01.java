package day09;

import java.util.Scanner;

public class TernaryQuestion01 {

	public static void main(String[] args) {
		
		/*5) Kullanıcıdan bir tamsayı girmesini isteyin, 
		 * o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		 3 basamaklı degilse çift olup olmadigini kontrol edin. 
		 Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		  Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Bir Tamsayi Giriniz");
		int num=scan.nextInt();
		
	String result=	num>99&&num<=999?"üc Basamakli sayi":num%2==0?"cif sayi":
			"üc basamkli olmayan tek sayi";
		
		
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
	}

}
