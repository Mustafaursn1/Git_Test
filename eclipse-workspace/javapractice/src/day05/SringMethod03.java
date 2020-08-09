package day05;

import java.util.Scanner;

public class SringMethod03 {

	public static void main(String[] args) {
		
			
			Scanner scan= new Scanner (System.in);
			System.out.println("Enter your e-mail adress please ?:");
			String str= scan.nextLine();
			System.out.println("your mail confirmartion result is"+" "+ getEmailDogrulama(str));
			scan.close();
			
			}
			
		// Kullanicidan alınan mail adresinin doğru olup olmadığını kontrol ediyoruz.
		// boolean method oluşturacağız return olarak true yada false dönecek.
		// alacağımz mail '@' içerecek, "" içermeyecek, '@'ten öncesi ve sonrası 1 er karakterden uzun olacak.
		// Dolayısıyla total mail 3 karakterden uzun olacak.
		
		public static boolean getEmailDogrulama(String str) {
			
			int s= str.indexOf('@');   // String'i @ olan kısma kadar böldük. s değeri @'in index'ini veriyor.
			String str1= str.substring(0, s); // str1 @'ten nceki kısım. 
			String str2= str.substring(s);// str2 @'ten sonraki kısım. uzunluğu 1'den büyük olmalı. 
			
			if (str1.length()<1) { // @'ten önceki kısım 1'den büyük olmalı.
				return false;}
				
			if (str2.length()<1) {  // @'ten sonraki kısım 1'den büyük olmalı.
				return false;}
			if (str.length()<3) {	 // mailin uzunluğu 3'ten büyük olmalı.
				return false;}
			if (!str.contains("@")) { // @ içermeli.
				return false;}
			
			if (str.contains(" ")) { // boşluk içermemeli.
				return false;}			
			
			else {
				return true;}


   }
   
}
