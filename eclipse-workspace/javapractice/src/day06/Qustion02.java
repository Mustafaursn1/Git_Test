package day06;



public class Qustion02 {

	public static void main(String[] args) {
		//Girilen sayının tersini return eden java methodunu yazınız.
		
		// //Girilen sayının tersini return eden java methodunu yazınız. 
		// 123  321 
		System.out.println("Sayinin tersi: " +sayininTersi(5678));
		

	}
	public static int sayininTersi(int n) {
		int sonuc=0;
		
		while(n>0) {
			int temp = n%10; //123 =>3   ===12 =>2  ==> 1
			n/=10;//123 /10 =>12  === 12 ==>1 =0
			sonuc=sonuc*10+temp;//3 == 32  ==> 321
			}
		return sonuc;

		
		
	}
	
	
}
