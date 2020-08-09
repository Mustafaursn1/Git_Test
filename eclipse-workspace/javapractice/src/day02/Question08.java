package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		//bir harf giriniz
		 // kücükse kücük büyükse büyük yazdir
		 // diger durumlar icin gecersiz yazdir.
		 
		

		 Scanner scan=new Scanner(System.in);
			
			
			System.out.println("bir harf  giriniz");
		
		char ch=scan.next().charAt(0);
		
		
	String result=ch>='a' &&ch<='z' ?"kücük harf":
		ch>='A'&& ch<='Z'?"büyük harf":"GECERSIZ";
		System.out.println(result);
		
		
		scan.close();
		

	}

}
