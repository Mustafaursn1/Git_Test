package day11;

import java.util.Scanner;

public class OdevSorular {

	public static void main(String[] args) {
		
		//) Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
		//rakamlarını ekrana yazdırın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kredi numaranizi yaziniz");
		
		String a=scan.next();
		
		System.out.println(a);
		
		
		scan.close();
		System.out.println();
		
		System.out.print(a.charAt(2));
		System.out.print(a.charAt(3));
		System.out.println(a.charAt(15));
		
		//dogru mu degil mi teyit et
		

	}

}
