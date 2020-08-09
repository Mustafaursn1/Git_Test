package day07;

public class AsalSayiCozum {

	public static void main(String[] args) {
		
		//asal sayi bulan bir method  yaziniz
		
		
		//!!!Asal sayi 1 ve kendisinden baska böleni olmayan sayilardir
		 
		asalSayi(343437);
		asalSayi(37);
		
		
		
		
		
		
	}

	public static int asalSayi(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Asal sayidir= "+num);
		}else {
			System.out.println("Asal sayi degildir="+num);
		}
		return count;
		
		
		
		
	}
	
	
	
	
}
