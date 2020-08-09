package day11;

public class StringMethotsOdev01 {

	public static void main(String[] args) {
		
		String str="CAT,caterpillar";
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("cat"));
		
		System.out.println(str.indexOf("s"));//-1??
		
		System.out.println(str.indexOf("CAT"));
		
		
		
		System.out.println(str.indexOf("a", 3)); //5
		
		System.out.println(str.indexOf("at", 2)); //5
		
		System.out.println(str.lastIndexOf("a"));//13
		System.out.println(str.lastIndexOf("cat"));//4
		System.out.println(str.lastIndexOf("a", 7)); // ??????tekrar bak
		
   String str1="";//true
   System.out.println(str1.isEmpty()); 
   String str2=" ";
   System.out.println(str2.isEmpty());//false
   String str3="ALMANYA";
   System.out.println(str3.isEmpty()); //false
   
   System.out.println(str.toUpperCase());//CAT,CATERPİLLAR
   System.out.println(str.toLowerCase());//cat,caterpillar
   System.out.println(str.toUpperCase().toLowerCase());//cat,caterpillar
   
   String str4="Cat";
   System.out.println(str4.trim()); //öndeki arkadaki bosluklari siler
   String str5=" Cat";
   System.out.println(str5.trim());
   String str6=" Cat    ";
   System.out.println(str6.trim());
   String str7="CAT    ,DOG   ,CAD   ";
   System.out.println(str7.trim());//CAT    ,DOG   ,CAD
   
   System.out.println(str4.contains("a")); //true
   
   System.out.println(str4.contains("Cat"));//true
   
   
   System.out.println(str4.contains("CAt"));//false
   
   

		
		
		
		
	}

}
