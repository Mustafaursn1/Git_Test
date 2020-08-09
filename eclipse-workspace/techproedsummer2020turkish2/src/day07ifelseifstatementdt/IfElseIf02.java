package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		
		
		
	//kullanicidan bir harf alin
		//bu harf "a" "A" ISE ILK HARF YAZ
		//"B "b" 2.harf yaz
		//c C ISE 3 hardf
		// diger harflerde sirayi bilmiyorum 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		
		char cr=scan.next().charAt(0);
		
		
		
		if (cr=='a'||cr=='A') {
			System.out.println("ILK HARF");
		}
		
		else if(cr=='b'||cr=='B') {
			System.out.println("2.HARF");
		}
		
		else if (cr=='c'||cr=='C') {
			System.out.println("3.HARF");
		}
		
		
		else {
			System.out.println("sirasini bilmiyorum");
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
