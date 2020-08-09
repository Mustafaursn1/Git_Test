package day06;

import java.util.Scanner;

public class Question06 {

	


	public static void main(String[] args) {
		
		//girilen Stringin harflerini satir satir yazdirin
	// Girilecek bir stringin her karakterini satir satir yazdiralim.
		
		//kemal
		//k
		//e
		//m
		//a
		//l
		Scanner  input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str = input.next();
		stingSutun(str);
		input.close();
	}
	
	public static void stingSutun(String str) {
			System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
			System.out.println(" ");
			
		}

	}

}


