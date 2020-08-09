package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array03 {

	public static void main(String[] args) {
		//array elemanlarinin ortalamsini bulan  java kodu yaziniz
		
		//20,30,40,25,-15,55
		
		double []arr= {20,30,40,25,-15,55};
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
			
		}System.out.println(sum/arr.length);//25.833333333333332
		
		
				
		
		

	}

}
