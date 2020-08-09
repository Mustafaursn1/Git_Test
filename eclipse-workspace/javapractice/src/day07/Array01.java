package day07;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
	
		//3 3l3manli string Array olusturalim
		//clever,meek,nice
		//tek tek ve liste halinde yazdiralim
		//her bir array elemanina "ly" ekleyelim
		
		
		String s[]= {"clever","meek","nice"}; 
		
		System.out.println(Arrays.toString(s));
		
		System.out.println();
		
		//1.yol
	
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+"ly"+" ");
		}
		
		System.out.println();
		//2.yol
		
		for(String w:s) {
			System.out.print(w+"ly"+" ");
		}
		
		
		
		
		

	}

}
