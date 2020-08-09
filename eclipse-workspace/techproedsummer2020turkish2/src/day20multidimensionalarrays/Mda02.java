package day20multidimensionalarrays;

public class Mda02 {

	public static void main(String[] args) {
		
		//multi dimensionalarrays olusturun tüm elöemanlarini ekrana yazdirin
		int mdai[][]= { {1,2} ,{3} ,{4,5,6}};
		//1.yol
		
		System.out.println(mdai[0][0]+mdai[0][1]+mdai[1][0]+mdai[2][0]+mdai[2][1]+mdai[2][2]);
		
		
		int sum=0;
		
		for(int i=0;i<mdai.length;i++) {
			for(int k=0;k<mdai[i].length;k++) {
				System.out.print(mdai[i][k]+" ");
				sum=sum+mdai[i][k];
			}
			
		}System.out.println();
		System.out.println(sum);
		
		
		
		
	}

}
