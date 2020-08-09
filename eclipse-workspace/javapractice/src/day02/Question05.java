package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		// Kullanıcıdan  yışını ve kilosunu alalım
		// 18 yaşından küçük ise kan bağışı yapamaz
		// 18 yaşından büyük ve 50 kilo dan hafif ise kan bağışı yapamaz.
		// 18 yaşından büyük ve 50 kilodan ağır ise kan bağışı yapabilir.	
		
		
      Scanner scan=new Scanner(System.in);
		
		
		System.out.println("yasinizi giriniz");
		int yas=scan.nextInt();
		System.out.println("kilonozu giriniz");
		int kilo=scan.nextInt();
		
		if(yas>18) {
			if(kilo>50) {
				System.out.println("kan verebilirsiniz");
			}else {
				System.out.println("50 kilopdan ay olanlar kan veremz");
			}
		}else {
			System.out.println("kan veremzsiniz yasiniz kücük");
		}
		
			scan.close();
		
		
	}	

}
