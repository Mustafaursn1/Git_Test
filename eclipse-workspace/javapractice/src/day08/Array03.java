package day08;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		//bir int array icerisinde aradigimiz sayinin olup olmadigini kont edelim
		
		int []arr= {12,32,34,54,45};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));
		for(int i=0;i<arr.length;i++) {
			if(String.valueOf(arr[i]).contains("13")) {
				System.out.println("Aradiginiz deger var");
				break;
			}else {
				System.out.println("Aradiginiz deger yok");
				break;
			}
		}
		
		
		
		
		
		
	}
	
	public static boolean getVarmi(int []sayilar) {
		for(int i=0;i<sayilar.length;i++) {
			if(String.valueOf(sayilar[i]).contains("2"))
			return true;
		}
		return false;
	}
	
	
	

}
