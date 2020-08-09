package day20;



public class McaQuestionDiificult03 {

	public static void main(String[] args) {
		/*3) Aşağıdaki multi dimensional array’lerin iç array’lerinde 
		 * aynı index’e sahip elemanların toplamını ekrana yazdıran bir program yazınız. (Zor soru)
          arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		*/
		 
		int arr1[][]={ {1,2},   {3,4,5}, {6}  };
		int arr2[][]={ {7,8,9}, {10,11}, {12} };	
			
		
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				for(int k=0;k<arr1[i].length;k++) {
					
					for(int m=0;m<arr2[j].length;m++) {
						
						if(i==j&&k==m) {
							sum=sum+arr1[i][k]+arr2[j][m];
							
						}
						}
					}
					}
					}System.out.println(sum);
	

		
		
		
		
		
		
		
		
		
	}

}
