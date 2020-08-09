package day13dowhileslaytsoeular;

import java.util.Scanner;

public class DoWhileSoru02 {

	public static void main(String[] args) {
		
		
		/*2) Kullanıcıdan başlangıç ve bitiş değerlerini alın 
		 * ve başlangıç değerinden başlayıp bitiş değerinde
           biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.

		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.print( "1.sayi:");
		int a=scan.nextInt();
		
		System.out.print("2.sayi: ");
		int b=scan.nextInt();
		
		int i=a;
		
		do  {
			if (i%4==0 && i%6==0)
			System.out.print(i+" -");
			i++;
			}while (i<=b);
		
		scan.close();

		
		
		

	}

}
