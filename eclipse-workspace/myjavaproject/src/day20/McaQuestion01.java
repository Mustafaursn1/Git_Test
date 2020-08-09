package day20;

public class McaQuestion01 {

	public static void main(String[] args) {
		
		
		
		//1) Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını
		//ekrana yazdıran bir program yazınız.
	    //{ {1,2,3}, {4,5,6} }

		
		int mcai[][]={ {1,2,3}, {4,5,6} };
		
		
		int product=1;
		for(int i=0;i<mcai.length;i++) {
			
			
			for(int k=0;k<mcai[i].length;k++) {
				System.out.print(mcai[i][k]+"-"); //tek satirda elemanlari yazdiriyoruz
				product=product*mcai[i][k];
				
			}
		}
		System.out.println();
		System.out.println(product);
		
		
		
		

	}

}
