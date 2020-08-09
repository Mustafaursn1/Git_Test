package day11;

import java.util.Scanner;

public class OdevSorular1 {

	public static void main(String[] args) {
		
		//2) Kullanıcıdan ilk ve soy ismini alın i
		//lk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi  giriniz");
		
		String a=scan.next();
		
		System.out.println(a);
		System.out.println("soy isiminizi giriniz");
		String b=scan.next();
				System.out.println(b);
		
	   System.out.println(a.length()+b.length());
		
		
		scan.close();
		//dogru mu degil mi teyit et
		
	}

}
