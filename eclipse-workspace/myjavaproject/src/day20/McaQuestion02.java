package day20;

public class McaQuestion02 {

	public static void main(String[] args) {
		//2) Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını 
//ekrana yazdıran bir program yazınız { {1,2,3}, {4,5}, {6} }
		
	int mcai[][]=	{ {1,2,3}, {4,5}, {6} };
	//1.yol	
		
	int product=1;
	for(int i=0;i<mcai.length;i++) {
		for(int j=0;j<mcai[i].length;j++) {
			if(j==mcai[i].length-1) {
				
				product=product*mcai[i][j];
				System.out.print("son elemanlar="+mcai[i][j]+" ");//son elemanlari yazdirir
				
				
			}
			
		}
		
	}System.out.println(product);
	
	
	
	

	}

}
