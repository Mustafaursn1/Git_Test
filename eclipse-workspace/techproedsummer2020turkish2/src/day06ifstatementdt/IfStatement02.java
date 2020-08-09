package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		//String leri karsilastiriken == kullanmayin
		//stringleri karsilastiriken kesinlikle equals() kullanin
		//equals metodu boolean  return eder.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir gün giriniz");
		String gun=scan.next();
		
		if(gun.equals("cuma")) {
			System.out.println("MÜSLÜMANLAR ICIN KUTSAL GÜN");
			
		}
		
		if(gun.equals("cumartesi") ){
			System.out.println("YAHUDILER ICIN KUTSAL GÜN");
			
		}
		
		if(gun.equals("pazar")) {
			System.out.println("HRISTIYANLAR ICIN KUTSAL GÜN");
		}
		
		   gun.equals("pazar");
		scan.close();
		
		
		

	}

}
