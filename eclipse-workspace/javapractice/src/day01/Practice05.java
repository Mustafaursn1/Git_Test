package day01;
import java.util.Scanner;
public class Practice05 {
	/* Basit bir bilgi tablosu oluşturalım.
	 * 
	 * 1. Adım : Scanner classtan nesne üretelim.
	 * 2. Adım : Kullanıcıdan isim alalım.
	 * 3. Adım : Kullanıcıdan soyisim alalım.
	 * 4. Adım : Kullanıcıdan, boy bilgisi alalım.
	 * 5. Adım : Kullanıcıdan, kilo bilgisi alalım.
	 * 6. Adım : Kullanıcıdan, hobi bilgisi alalım.
	 * 
	 * Not : Tüm işlemleri variable(değişken) kullanarak yapın.
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * */
	public static void main(String[] args) {
		/// Kullanıcıdan veri almak için Scanner class'ını kullanmalıyız.
		Scanner scan = new Scanner(System.in);
		/// String isim = "Ahmet";
		// scan.next() ve scan.nextLine() ifadelerini yazı almak için kullanıyoruz.
		// ilk kelime	    tüm metin	
		System.out.println("İsim ve soyisim yazınız : ");
		String isimSoyisim = scan.nextLine();
		// sayı almak için nextInt , nextShort, nextLong
		System.out.println("Boyunuzu yazınız : ");
		short boy = scan.nextShort();
		// ondalıklı sayı almak için nextFloat ya da nextDouble
		System.out.println("Kilonuzu yazınız : ");
		float kilo = scan.nextFloat();
		// nexLine ile gelecek yazıları aldık.
		System.out.println("Hobilerinizi yazınız : ");
		scan.nextLine();
		String hobi = scan.nextLine();
		System.out.println(isimSoyisim);
		System.out.println(boy);
		System.out.println(kilo);
		System.out.println(hobi);
		scan.close();
	}
}