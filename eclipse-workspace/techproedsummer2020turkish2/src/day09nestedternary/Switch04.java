package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ay giriniz");
		String ay=scan.next();
		
		/*switch lerde boolean long double float kullanilmaz
		 * byte short int string kullanilir
		 * 
		 * 
		 */
		
		
		switch (ay) {
		
		case "ocak":
			
		case "subat":	
			
		case "aralik":
			
		System.out.println("kis");
		break;
		
		case "mart":
		case "nisan":	
		case "mayis":
		System.out.println("ilk bahar");
		break;
		
		case "hayiran":
		case "temmuz":	
		case "agustos":
		System.out.println("yaz");
		break;
		
		case "eylül":
		case "ekim":	
		case "kasim":
		System.out.println("son bahar");
		break;
		default : 
			System.out.println("tanimsiz");
	
		
		
		
		
		
		}  
		
		
		
		scan.close();
		
		
		
	}

}
