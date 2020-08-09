package day05;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {
		//kullanicidan alacagimiz hotmai.com adresini gmail.com olarak degistiriniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Mail adresinizi giriniz");
		String hotmail=scan.next();
		System.out.println(hotmail.replace("@hotmail.com", "@gmail.com"));
		
		
		//2.yol
		if(hotmail.contains("hotmail")) {
			String gmail=hotmail.replace("@hotmail.com", "@gmail.com");
			System.out.println(gmail);
		}else {
			System.out.println("Mail adresiniz hotmail icermiyor");
		}
		
		scan.close();
	}

}
