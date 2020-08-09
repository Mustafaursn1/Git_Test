package day13dowhileslaytsoeular;

import java.util.Scanner;

public class DoWhileSoru03 {

	public static void main(String[] args) {
		
		/*Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, 
		 * ekrana o ana kadar girmiş olduğu tüm sayıların toplamını yazdırınız.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		
		int i=0;
		int sum=0;

		do {
			if (i!=0)
			System.out.println("Bir sayi giriniz: ");
			i=scan.nextInt();
			sum=sum+i;
			
		}while(i!=0);
		System.out.println(sum);
		
		scan.close();
		

	}

}
