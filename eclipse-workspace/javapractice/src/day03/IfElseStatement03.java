package day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		
		// Kullanicidan boy CM  ve kilosunu alalim
				//BMI (VKE) hesaplayalım
				//BMI <=20 oldukca zayifsiniz
				//20<BMI<=25 Normal sinirlardasiniz 
				//25<BMI<=30 Sisman kategorisindesiniz
				//30<BMI ==> Obez grubundasiniz.
				//BMI = kilo /(boy*boy)

		
		Scanner scan =new Scanner(System.in);
		System.out.println("boyunuzu giriniz");
		int i=scan.nextInt();
		System.out.println("kilonuzu giriniz");
		double k=scan.nextDouble();
		
		double ibm=(k/(i*i))*100*100;
		System.out.println(ibm);
		
		if (ibm<=20) {
			System.out.println("oldukca zayifsiniz");
		} else if(ibm>20&&ibm<=25) {
			System.out.println("normal sinirdasiniz");
		} else if(ibm>25&&ibm<=30) {
			System.out.println("kilolusunuz");
		}else if(ibm>35) {
			System.out.println("obez grubundasiniz");
		}else {
			System.out.println("lütfen gecerli deger giriniz");
		}
		
		scan.close();
		
		
		
		
	}

}
