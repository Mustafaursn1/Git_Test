package day20;

import java.util.Arrays;

public class A01Sort {

	public static void main(String[] args) {
		
		int arr[]= {2,5,3,6,4,7,99,56,78,34,51,35};
		//arr Array'ini kücükten büyüge dogru siralayiniz
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[2, 3, 4, 5, 6, 7, 34, 35, 51, 56, 78, 99]
		Arrays.binarySearch(arr, 35);
		System.out.println(Arrays.binarySearch(arr, 35));//7 35 in indexi
		
		
		//6 elamani var mi yok mu kont edelim varsa var diyelim yoksa yok yazdiralim
		//1.yol
	System.out.println(Arrays.binarySearch(arr, 6));
	
		
		if(Arrays.binarySearch(arr, 6)>0) {
			System.out.println("6 var ve"+" "+"indeksi="+Arrays.binarySearch(arr, 6));
		}else {
			System.out.println("6 yoktur");
		}
		
 //2.yol
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==6) {
				count++;
				
				
			}
			
		}
		if(count>0) {
			System.out.println("6 vardir");
			
		}else {
			System.out.println("6 yoktur");
		}
		
		
	}

}
