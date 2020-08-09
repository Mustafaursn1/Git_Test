package day05;

import java.util.Scanner;

public class QustionInterview1 {

	public static void main(String[] args) {
		//Interview sorusu
		/*kullanicidan bölünen ve bölen seklinde iki sayi alalim
		 * bölme operatörü kullanmadan bölümü yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bölünen sayiyi giriniz");
		int i=scan.nextInt();
		System.out.println("bölen sayiyi giriniz");
		int k=scan.nextInt();
		
		int sayma=0;
		for(;sayma<i;sayma++) { 
			if((sayma*k+(i%k)==i)) {
				System.out.println("bölüm="+sayma);
				System.out.println("kalan="+(i%k));
				
			}
			
		}
		
		scan.close();
		

	}

}
