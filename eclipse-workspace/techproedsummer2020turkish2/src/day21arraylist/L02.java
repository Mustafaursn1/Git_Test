package day21arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		
		/*List:
1) Array - List farki nedir
2) List olusturma
3) List'e iki yol ile eleman ekleme ==> add() - add(index, eleman)
4) List'i console'a yazdirma
5) List'in uzunlugunu bulma
6) List'in bos olup olmadigini kontrol etme
7) Index'e gore eleman silme
8) Eleman'a gore eleman silme
9) remove() methodlarinin ne return ettigini ogrendik

		 * 
		 */
		
		//bir elemani degistirmek
		
		List<String>sl=new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		System.out.println(sl);//[Ali, Kemal, Ayse]
		
		sl.set(0,"Aliye");
 System.out.println(sl.set(0, "Aliye"));
		
		
		System.out.println(sl);//[Aliye, Kemal, Ayse]
		//BIR ELEMAN VAR MI YOK MU BAKMAK
		System.out.println(sl.contains("Kemal")); //TRUE
		System.out.println(sl.contains("wwwww"));//FALSE

		//elemanlari naturel order(kücükten büyüge+alfabetik siraya göre dizmek)' a
		//gore nasil dizeriz
		
		
		Collections.sort(sl);//<======cok kullanilir
		
		System.out.println(sl);//[Aliye, Ayse, Kemal]
		
		//elemanlari naturel order`in tersine göre siralama;
		
		
		Collections.reverse(sl);
		System.out.println(sl);//[Kemal, Ayse, Aliye]
	//List' deki elemanlarin tamamini nasil sileriz
		sl.clear();
		System.out.println(sl);//[]
		//iki List'in esit olup olmadigini nasil kont ederiz
		//!!!Listler asla primitive data ile calismaz
		//list<int> il1=new ArrayList<>();
		
		//her pirimitive data type nin bir Wrapper Class'i vardir
		/*boolean====> Boolean
		 * char====>Character
		 * byte====>Byte
		 * short====>Short
		 * long====>long
		 * int====>Integer
		 * float====>Float
		 * double====>Double
		 */
		
		List<Integer>il1=new ArrayList<>();
		
		il1.add(12);
		il1.add(14);
		il1.add(13);
		List<Integer>il2=new ArrayList<>();

		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		System.out.println(il1.equals(il2));//esitse true degilse false
		//hem elemanlari hem de indexlerini kont eder
		
		
		
		
		
	}

}
