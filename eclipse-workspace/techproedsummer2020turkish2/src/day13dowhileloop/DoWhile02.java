package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		//kullanicidan sayi aliniz
		//SAYI CIFT ISE  EKRANA KAZANDINIZ YAZDIRIN
		//TEK ISE KAYBETTINIZ YAZDIRI VE YENI BIR SAYI ISTEYIN
		
		Scanner scan=new Scanner(System.in);
		int s=4;
		
		do {
			if(s%2==1) {
				System.out.println("kaybettiniz ");
			}
			System.out.println("lütfen tekrar bir sayi giriniz");
			s=scan.nextInt();
		}while(s%2==1);
		System.out.println("tebrikler kazandiniz");
		scan.close();
		
		
		
		
		
		
		
		
	}

}
