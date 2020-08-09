package day06ifstatementdt;



public class IfElseStatement01 {

	public static void main(String[] args) {
		
		//if -else statement te ya if calisir ya else bölümü calsir
		//asla ikisi birlikte calismaz
		//condition TRUE ISE if calisir
		//yanlis ise else bölümü calisr.
		
		int num=100;
		
		
		if(num<0) { 
			System.out.println("Negatif");
			
		}
		else { 
			System.out.println("Negatif degil");
			
		} 		
		
		//2.cözüm(1.yol daha hizli calistiri)
		
		//1 condition 1 kontrol 2 condition 2 kontrol
		
		if(num<0) {
			System.out.println("Negatif");
		}
		
		if(num>=0) {
			System.out.println("Negatif degil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
