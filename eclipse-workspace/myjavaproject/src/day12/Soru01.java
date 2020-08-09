package day12;

public class Soru01 {

	public static void main(String[] args) {
		
		//3 den 13 e kadar sayilariwhile look ile yazdir
		
		int j=3;
		while(j<13) {
			System.out.print(j+"-");
			j++;
		}
		
		
		//2) Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden
//veya sonrasından başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
System.out.println();
	
		int i=0;
		while(i<50) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		i++;
		}
		

	}

}
