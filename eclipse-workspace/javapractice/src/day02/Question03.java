package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		
		/*/ Kullanıcıdan 5 basamaklı sayı alalım, 
		 *  ilk 2 ve son 2 basamaklarındaki sayıların
		sayı değerlerini toplayalım
		
		!!!!!!!tekrar kendin cöz!!!!!!!!!!!!!!!!!!!!
		  
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kullanicidan 5 basamakli bir sayi aliniz");
		
		int num=scan.nextInt();
		int ilk2=num/1000;
		int son2=num%100;
		int ikiTop=(ilk2%10)+(ilk2/10);
		int sonIkiTop=(son2%10)+(son2/10);
		System.out.println("sayilarin toplami="+(ikiTop+sonIkiTop));
		
		scan.close();
		
		
	}

}
