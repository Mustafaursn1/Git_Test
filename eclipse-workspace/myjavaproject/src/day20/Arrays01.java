package day20;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int arr[]= { 10,20,30,40,50};
		for (int i=0;i<arr.length;i++) {
			System.out.println(""+arr[i]);
		}
				
		
		int arr1[]=new int[2];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		int arr2[]= {1,2,3};
		int arr3[]= {1,2,3};
		
		int z=0;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==arr3[i]) {
				z++;
			
		}
		}
		 if(z==arr2.length)   {
			 System.out.println("ayni");
		 }else {
			 System.out.println("ayni degil");
		 }
		 //2.yol
if(Arrays.equals(arr2, arr3)) {
	System.out.println("2.yol-ayni");
}else {
	System.out.println("ayni degil");
}
	}

}
