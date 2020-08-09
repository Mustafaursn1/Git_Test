package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("tam isminizi griniz");
		String tamIsim=scan.nextLine();
		System.out.println(tamIsim);
		
		
		System.out.println("yasinzi giriniz");
		byte yas=scan.nextByte();
		System.out.println(yas);
		
		System.out.println("isminizin ilk harfini giriniz");
		char ilkHarf=scan.next().charAt(0);
		System.out.println(ilkHarf);
		
		System.out.println("cocuk sayiniyi giriniz");
		int cocukSayisi=scan.nextInt();
		System.out.println(cocukSayisi);
		
		scan.close();
		
		
		
	}

}
