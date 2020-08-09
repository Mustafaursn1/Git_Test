package day04;

import java.util.Scanner;

public class stringMethot02 {

	public static void main(String[] args) {
		
		//kullanicidan bir kelime alin
		//kelimeyi tersten yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir keime giriniz");
		
		String str=scan.nextLine();
		
		 scan.close();
	 String tersStr="";
	
	 System.out.println(str.length()-1);
	 
	for (int count=str.length()-1;count>=0;count--) {
	
	  tersStr=tersStr+str.charAt(count);//adana

	
	}
		System.out.println(str);
	System.out.println(tersStr);
	

	
		
	}

}
