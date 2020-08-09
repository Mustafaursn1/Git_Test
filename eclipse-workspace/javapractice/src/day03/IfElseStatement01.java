package day03;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
	//kullanicidan 4 islemden 1 ini sectirelim
     //2 sayi girsin
		// sonucu yazdir
		//toplam 5 6 toplama isleminin sounucu :5+ 6=11
		
		Scanner scan =new Scanner(System.in);
		System.out.println("4 islemden birini seciniz. \ntoplama\ncikarma\ncarpma\nbölme");
		String islem=scan.nextLine();
		System.out.println("iki sayi giriniz");
		double k=scan.nextDouble();
		double i=scan.nextDouble();
		
		
		
		
		
	if (islem.equalsIgnoreCase("toplama")) {
		System.out.println("Toplama:"+k+"+"+i+"="+(i+k));
	}else if(islem.equalsIgnoreCase("cikartma")) {
		System.out.println("cikartma:"+k+"-"+i+"="+(k-i));
		
	}else if (islem.equalsIgnoreCase("carpma")) {
		System.out.println("carpma:"+k+"*"+i+"="+(k*i));
	}else if(islem.equalsIgnoreCase("bölme")) {
		System.out.println("bölme:"+k+"/"+i+"="+(k/i));
	}else {
		System.out.println("hatali secim");
	}
		
		
		scan.close();
		
		
		
		

		
		
	}

}
