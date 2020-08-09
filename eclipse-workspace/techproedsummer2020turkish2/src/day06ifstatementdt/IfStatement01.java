package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		//kullanicidan 1 sayi alin
		//bu sayi 3 e bölünüyorsa ekrana 3 ün kati  yazdirtin
		//3 e bölünmüyorsa 3 e bölünmüyor yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		int num=scan.nextInt();
		
		if(num%3==0)  {
			System.out.println("3'ün kati");
			
			}
		
		if(num%3!=0) {
			System.out.println("3`ün kati degil");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
