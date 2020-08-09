package day02;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
	
		/*kullanicidan 2 sayi al
		 * bunlari birbiri ile karsilastir
		 */
		
		// Kullanıcından 2 sayı alalım ve bunların birbirleriyle olan durumunu karşılaştırakım.
		
				/* 12 15      		12 < 15  12 != 15
				 * num1 > num2
				 * num1 < num2
				 * num1= num2
				 * num1 != num2
				 *  num1 <= num2
				 *  num1 >= num2
				 * 
				 */
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Lütfen 1. sayıyı giriniz");
				int num1 = sc.nextInt();
				System.out.println("Lütfen 2. sayıyı giriniz");
				int num2 = sc.nextInt();
				
				if(num1==num2) {
					System.out.println(num1 + "=" + num2);}
				
				if (num1 != num2) {
					System.out.println(num1 + "!=" + num2);
				}
				if (num1 < num2) {
					System.out.println(num1 + "<" + num2);
					
				}
				if (num1 <= num2) {
					System.out.println(num1 + "<=" + num2);
				}
				if (num1 > num2) {
					System.out.println(num1 + ">" + num2);
					
				}
				if (num1>= num2) {
					System.out.println(num1 + ">=" + num2);
				}
				

		
		sc.close();



	}

}
