package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
	//Bir Array'i List'e cevirebiliriz?
		String s[]= {"A","B","C"};
		System.out.println(Arrays.toString(s));//[A, B, C]
		List<String> sl=new ArrayList<>();
		
		sl=Arrays.asList(s);
		
		System.out.println(sl);//[A, B, C]
		//Bir List nasil Array'a cevirilibelir?
		Object listenArray[]=sl.toArray();
		// daha flexibel olmasi icin data type'ini parent'ten seceriz.yani object
		
		//java'da her class'in en az bir tane parent'i vardir
		//parent'i olamayan tek class object clss`dir
		//object class bütün class'larin ortak PARENT'idir
		System.out.println(Arrays.toString(s));//[A, B, C]
		
		
		
		
		
		

	}

}
