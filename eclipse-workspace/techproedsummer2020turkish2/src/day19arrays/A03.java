package day19arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		if(arr1==arr2) {
			System.out.println("same");
		}else {
			System.out.println("not same"); 
			//== oldugu icin not same gelir sebebi adres ve degerleri ayri ayri kont eder.
			//degerler ayni adresler farkli
		}
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		int[]x= {2,1,4,5,7};
		
		int limit=3;
		int i=0;
		int sum=0;
		while ((sum<limit)&&(i<x.length)) {
			i++;
			sum=sum+x[i];
		}
		System.out.println(sum);//5
		System.out.println(i);//2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
