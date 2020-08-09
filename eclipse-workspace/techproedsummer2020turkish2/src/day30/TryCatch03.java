package day30;

public class TryCatch03 {

	public static void main(String[] args) {
		
		System.out.println(exceptions());
		
		
		 /* !!!!!!!!!!!!interview sorusu!!!!!!!!!!!!!!!!
		 /*throw ile thorows keyword'lerinin farki
		 * 1)throw method body'si icinde yazilir,
		 * throws ise  method parentezi ile curly brace'in arasina yazilir.
		 * 2)throw 'u method body'i icinde exception almak istediginiz 
		 * her yerde  kullanabilirsiniz
		 * throws ise mecburen method isminden sonra bir kez kullanilir.
		 * 3)1 throw sadece 1 exception üretir.
		 * throws  ise birden fazla exception olusturulabilir 
		 * yani "throw NullPointerException,AritmeticException" mümkün
		 * 4)throw icin syntax ==>throw new NullPointerException;
		 * throws icin syntax ==> method() throws NullPointerException {}
		 */
		
		
		
		
		

	}
 public static String exceptions () {
	 String result="";
	 String v=null;
	 
	 try {
		 try {
			 result=result+"before";
			 v.length();
			 result=result+"after";
		 }catch(NullPointerException e) {
			 result=result+"catch";
			 throw new RuntimeException();
		 }finally {
			 result=result+"finally";
			 throw new Exception();//throw exception olusturmak icin kullanilir
					 
		 }
		 
	 }catch(Exception e) {
		 result =result+"done";
	 }
	 return result;
	 
 }
	
}

