package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.kenar");
		double a1=scan.nextDouble();
		System.out.println("2.kenar");
		double a2=scan.nextDouble();
		System.out.println("3.kenar");
		double a3=scan.nextDouble();
		
		String result=a1==a2&&a1==a3? "eskenar":"eskenar degil";
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
