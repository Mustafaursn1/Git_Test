package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		//while ile  dowhile farki
		//1.while önce sarti kont eder sonra code calistirir.
		//dowhile önce calsitirir sonra kont eder.
		//2).1.maddeden dolayi dowhile en az bir kere calsitri
		//while look da ekran bos kalabilir code n hic calismadigi da olur.
		
		
		
		
		int i=1;
		while (i<1) {
			System.out.println(i);    //ekrani bos birakitr
			i++;
		}
		
		
		
		do {
			System.out.println(i);// ekrana 1 yazdiri
			i++;
		}while (i<1);  
		
		/*SORU OYUN(KUMAR OYUNLARI GENELDE BÖYLEDIR)
		 * 
		 */
		//KULLANICIDAN BIR SAYI ALIN SAYI>10 ISE "KAZANDINIZ YAZDIRIN.
		//SAYI 10 VEYA  10DAN KÜCÜK ISE " KAYBETTINIZ" YAZIP TEKRAR SASI ISTEYIN
		
		
		//oyun gibi kod yazarken while icindeki sarti döngünün devam etme sartina göre ayarlayin
		//s variable 10 dan büyük her degeri verebilirsiniz
		
		Scanner scan=new Scanner(System.in);
		int s=20;
		do {
			if(s<=10) {
				System.out.println("kaybettiniz");
			}
			System.out.println("bir sayi giriniz");
			 s=scan.nextInt();
			// s=5; hep kaybettriri
		}while(s<=10);
		
		System.out.println("kazandiniz");
		
		scan.close();
		
		
		
		

	}

}
