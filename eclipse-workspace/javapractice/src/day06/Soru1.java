package day06;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		//Kullanıcıda bir String kümesi girmesini isteyelim ve Kaç kelimeden
        //oluştuğunu dönen java methodu yazınız.
		Scanner input=new Scanner(System.in);
		System.out.println("lütfen bir kelime grubu giriniz");
		
		String str=input.nextLine();
		System.out.println("metindeki kelime sayisi:"+kelimeSayisi(str));
		
		
		input.close();
		
	}
public static int kelimeSayisi(String str) {
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			count++;
		}	
		
	}
	count=count+1;
	return count;
	
}

}
	
	
	

