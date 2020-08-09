package day03;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		/*kullanicidan 2 sayi alalim
		 * kullanici 4 islemden birini scsin
		 * soncuc yazdiralim
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("4 islemden birini seciniz. \n1-toplama\n2-cikarma\n3-carpma\n4-bölme");
		String islem=scan.nextLine();
		System.out.println("iki sayi giriniz");
		double k=scan.nextDouble();
		double i=scan.nextDouble();
		
   
	
	
		switch (islem) {
		case "1":
			System.out.println("toplama:"+k+"+"+i+"="+(k+i));
			break;
		case "2":
			System.out.println("cikarma:"+k+"-"+i+"="+(k-i));
			break;
		case "3":
			System.out.println("bölme:"+k+"/"+i+"="+(k/i));
			break;
		case "4":
			System.out.println("carpma:"+k+"*"+i+"="+(k*i));
			break;
		
		 default :
			System.out.println("lütfen gecerli bir islem sec");
		}
	
		
		scan.close();
		
	
		

	}

}
