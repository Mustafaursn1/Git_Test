package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		/*
		 * kullnicdan numara alin ve günleri 1 pazar 7 cumartesi olacak
		 * sekilde numaralandirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gün icin 1 numara giriniz");
		
		int s=scan.nextInt();
		
		switch (s) {
		  
		case 1:
			  System.out.println("pazar");
			  break;
			
		case 2:
			  System.out.println("pazartesi");
			   break;
		case 3:
			  System.out.println("sali");
			  break;
			
		case 4:
			  System.out.println("carsamba");
			   break;
			      
		case 5:
			  System.out.println("persembe");
			  break;
			
		case 6:
			  System.out.println("cuma");
			   break;
		case 7:
			  System.out.println("cumartesi");
			  break;
			
		 default :{
		 
			 System.out.println("tanimlanamadi");
		 
		 }
		 
		
		
		}
		 
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
