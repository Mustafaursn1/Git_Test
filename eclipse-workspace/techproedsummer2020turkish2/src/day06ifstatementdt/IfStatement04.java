package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		
		
		
		//sayi alin
		//sayi 0 ile 9 arasinda ve 0 ve 9 a esitse rakam yazdir
		//sayi 9dan büyük 100 drn kücükse iki basamakli sayi yazdir
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
				
		int s=scan.nextInt();
		
		
		if(s>=0&&s<=9) {
			System.out.println("rakam");
		}
		
		if(s>9&&s<100) {
			System.out.println("iki basamakli sayi");
		}
		
		
		
		scan.close();
		
		
	}

}
