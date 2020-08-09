package day01;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		//kullanicidan veri al ve yazdir
		System.out.println("isim giriniz");
		
		Scanner scan=new Scanner(System.in);
		String isim=scan.next();
        System.out.println("isim:"+isim);
        
        System.out.println("soyisiminizi giriniz:");
        String soyIsim=scan.next();
        System.out.println("Soyisim:"+soyIsim);
		
        boolean booleanDegiskeni=scan.nextBoolean();
      
        
        byte byteDegiskeni=scan.nextByte();
        
        char charDegiskeni=scan.next().charAt(0);
        
        long longDegiskeni1=scan.nextLong();
        double doubleDegiskeni=scan.nextDouble();
		String isim1=scan.nextLine();
		
		
	
		scan.close();
		
		
		
	}

}
