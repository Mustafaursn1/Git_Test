package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	
	//	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden 
	//	başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");
		int baslangic=scan.nextInt();
		
		System.out.println("bitis degerini giriniz");
		int bitis=scan.nextInt();
		scan.close();
		
		
		int product=1;
		while(baslangic<=bitis) {
			product=product*baslangic;//baslngic degeri ile bitisten daha büyük olursa product=1 old ekrana 
			//1yansir
			baslangic++;
		}
		System.out.println(product);
		
	}

}
