package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		
		//BIR STRINGI PARCALARA AYIRMAK
		
		String str="Ipek topu at, topu at Ipek"; //, den itibaren bölecegiz 2 parcaya
		
		String strArray[]=str.split(",");
		System.out.println(Arrays.toString(strArray));//[Ipek topu at,  topu at Ipek] , array deki virgül
	//str stringde kac kelime var!!!!!!önemli sorudur
	
	 String sArray[]=str.split(" ");
	
	System.out.println(Arrays.toString(sArray)); //[Ipek, topu, at,, topu, at, Ipek]
	System.out.println(sArray.length);//6 kelime
	
	String tArray[]=str.split("");
	System.out.println(Arrays.toString(tArray));
	//[I, p, e, k,  , t, o, p, u,  , a, t, ,,  , t, o, p, u,  , a, t,  , I, p, e, k]
	System.out.println(tArray.length);//26
	//bu kod space dahil tüm karekterleri ayirir.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
