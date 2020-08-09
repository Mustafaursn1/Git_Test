package day04Scanner;

public class Typecasting02 {

	public static void main(String[] args) {
		
		
		int i1=5/2;
		System.out.println(i1);
		
		//java 2.5 un ondalik kesmini atar yuvarlama yapmaz
		//decimal bir sayiyi byte ,short,int,long gibi bir tamsayiya 
		//assign edersek java o sayinin ondalik kismini iplat eder
		
		double d1=5/2;
		System.out.println(d1);//2.0
		//java int/int sonucu int kabul eder
		
		
		
		
		double d2=5.0/2;//2.5
		System.out.println(d2);
		double d3 =5/2.0;
		System.out.println(d3);//2.5
		
		//matematik islemlerinde birden cok data type kullanilirsa 
		//java sonucu büyükn yata type ne göre verir

	}

}
