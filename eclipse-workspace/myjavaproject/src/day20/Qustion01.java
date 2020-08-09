package day20;

public class Qustion01 {

	public static void main(String[] args) {
		/*Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol eden bir program yazınız.
		 * Aynı eleman varsa “Aynı eleman var” yoksa “Aynı eleman yok” yazdırınız.
		 * 
		 */
		
		
		int arr[]= {1,2,3,1 };
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for (int k=0;k<arr.length;k++) {
				if(arr[i]==arr[k]&&i!=k) {
					count++;
					
				}	
			}
			
		}if(count!=0) {
			System.out.println("ayni eleman var");
		}else {
			System.out.println("ayni eleman yok");
		}
		System.out.println(count);	
		//bu soruda tekrar eden terim sayisini bulma üzerine calismaliyim...
		
	}

}
