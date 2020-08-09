package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
	/*kullanicidan sayi al
	 tek ise karesini yaz
	 cift ise yarisini yazdir	
	 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		
		int s=scan.nextInt();
		
	    int result= s%2==0? s/2:s*s;
		
		
		System.out.println(result);
		
		
		scan.close();
		

	}

}
