package day04Scanner;

public class Typecasting01 {

	public static void main(String[] args) {
		
		//kücük data type nin büyük data type ne cast edilmesi
		
		// auto widening  (genisletme) casting
		
		byte b1=13;
		
		int i1=b1;
		System.out.println(b1); //13
		System.out.println(i1); //13
		
		short s1=2300;
		float f1=s1;
		System.out.println(s1);//2300
		System.out.println(f1 );  //2300.0
		
		// explicit(acikca)daraltma(Narrowing)
		
		short s2=120;
		byte b2=(byte)s2;
		System.out.println(s2);
		System.out.println(b2);
		
		double d1=23.789872625424242526227;
	    float  f2_=(float)d1;     //float ta yuvarlama yapar
	    System.out.println(d1);
	    System.out.println(f2_);
	    
	    
	    
	    
	    short s3=1200;
	    byte b3=(byte)s3;
	    System.out.println(s3);
	    System.out.println(b3);
	    
	    
	    //asagidaki hata kac farkli sekilde düzeltilir
	    
	   // float f3=2.34   burda bir hata var:commenti kaLDIR GÖR:))
	    		//1.2.34 den sonra f yazarim  float f3=2.34f;
	    		//2.34ün önüne float yazaruz float f3=(float)
	    		//data type ni double cevirin double f3=2.34;
	    		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    
		
		
		
		
		
		
		
		
		
		
	}

}
