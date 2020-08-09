package day02;

import java.util.Scanner;

public class Question06Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		// Kullanıcıdan  yışını ve kilosunu alalım
		// 18 yaşından küçük ise kan bağışı yapamaz
		// 18 yaşından büyük ve 50 kilo dan hafif ise kan bağışı yapamaz.
		// 18 yaşından büyük ve 50 kilodan ağır ise kan bağışı yapabilir.	
		
		
		
	      Scanner scan=new Scanner(System.in);
			
			
			System.out.println("yasinizi giriniz");
			int yas=scan.nextInt();
			System.out.println("kilonozu giriniz");
			int kilo=scan.nextInt();
			
	String result= yas>18?kilo>50	?"kan bagisi yapabilir":"kan bagisi yapamaz"
		:"18 yasindan kücükler bagis yapamaz";
		
	System.out.println(result);
	
	
	scan.close();
	
	
	
	}

}
