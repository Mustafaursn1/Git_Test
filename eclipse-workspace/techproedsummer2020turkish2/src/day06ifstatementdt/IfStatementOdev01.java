package day06ifstatementdt;

import java.util.Scanner;

public class IfStatementOdev01 {

	public static void main(String[] args) {
		
		
		//Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan 
		//biri ise ekrana 
		//“Sesli harf” yazdırın. “b, c, d, f” den 
		//biri ise ekrana “Sessiz harf” yazdırın.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf söyleyiniz");
		String harf=scan.next();
		
		if(harf.equals("a")) {
			System.out.println("sesli harf");
		}
		
		if(harf.equals("e"))  {
			System.out.println("sesli harf");
		}
			
			
		if(harf.equals("i"))  {
			System.out.println("sesli harf");
		}
		
		if(harf.equals("o"))	{ 
			System.out.println("sesli harf");
			
		}
		if(harf.equals("u"))	
				
		{
		
				System.out.println("sesli harf");
				
				
				
		}
		
		
		
		
		if(harf.equals("b"))  {
			System.out.println("sessiz harf");
		}
		

		if(harf.equals("c"))  {
			System.out.println("sessiz harf");
		}
		
		

		if(harf.equals("d"))  {
			System.out.println("sessiz harf");
		}
		
		

		if(harf.equals("f"))  {
			System.out.println("sessiz harf");
		}
		
		
		scan.close();
		
		
		

	}

}
