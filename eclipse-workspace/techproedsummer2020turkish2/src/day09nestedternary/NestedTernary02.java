package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Ucu birbirine esitse ucgenin cevresini kontrol edin
		 Cevre 30 dan buyuk ise "Ne buyuksun!" yazdirin degilse "Normal" yazdirin
		 Ucu birbirine esit degilse ucgenin cevresini kontrol edin
		 Cevre 20 den kucuk ise "Ne kucuksun!" yazdirin degilse "Normal" yazdirin
		*/

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.KENARI GIRINIZ");
		double k1=scan.nextDouble();
		System.out.println("2.kenari giriniz");
		double k2=scan.nextDouble();
		System.out.println("3.kenari giriniz");
		double k3=scan.nextDouble();
		
		double u=k1+k2+k3;
		
		String result=k1==k2&&k2==k3? u>30?"ne büyüksün":
	 "normal": u<20?"ne kücüksün":"normal";
		
		System.out.println(result);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
