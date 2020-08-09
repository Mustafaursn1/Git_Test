package day01;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("2.sayiyi giriniz");
		int sayi2=scan.nextInt();
		System.out.println(sayi1+sayi2);
		
		
		int toplam=(sayi1+sayi2);//bu sekilde de olur
		
		System.out.println(toplam);
		
		scan.close();
		
		

	}

}
