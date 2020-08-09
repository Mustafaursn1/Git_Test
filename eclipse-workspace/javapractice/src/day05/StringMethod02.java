package day05;

public class StringMethod02 {

	public static void main(String[] args) {
		/*name1 ve name2 seklinde string tanimlayalim
		 * name1 karakter sayisi cift ise name2 yi name1 in orta kismindan iceri yaziniz
		 */
		
		String name1="MEHMET";
		String name2="Ahmet";
		if(name1.length()%2==0) {
			System.out.println(name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2, name1.length()));
		}else {
			System.out.println("cift karakterli degil");
		}
		
		//2.YOL

		boolean nameCift=name1.length()%2==0;
		
		String ilkKisim=name1.substring(0, name1.length()/2); //(0,]
		String ikinciKisim = name1.substring(name1.length()/2); //start, 
		
		if(nameCift) {
			System.out.println(ilkKisim +name2 + ikinciKisim);
		}else {
			System.out.println("Name1 karakter sayisi tektir.");
		}

		
		
		
		
		
	}

}
