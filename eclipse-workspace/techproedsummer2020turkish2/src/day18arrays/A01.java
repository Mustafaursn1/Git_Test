package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr1[]=new int[3 ]; //3 length
		//bir Arrays'i ekrana yazdirmak icin  Arrays.toString() kullaniriz
		System.out.println(Arrays.toString(arr1)); //[0,0,0] default value
		
		//bir Arrays'e eleman ekleme ===> son eleman 11 olsun
		arr1[2]=11;
		System.out.println(Arrays.toString(arr1)); //[0,0,11]
		//<=== orta eleman 9 olsun
		arr1[1]=9;
		System.out.println(Arrays.toString(arr1)); //[0,9,11]
		arr1[0]=7;
		System.out.println(Arrays.toString(arr1)); //[7,9,11]
		//arr1[3]=12;
		//System.out.println(Arrays.toString(arr1)); 
		//bir Array da cte degil run time error verir
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at dayarrays.A01.main(A01.java:21) (error name)
		
		//!!!kisa yoldan Arrays'lere deger atama.
		int arr2[]= {8,10,12,14 };
		System.out.println(Arrays.toString(arr2));//[8,10,12,14]

		//bir Arrays deki belli bir elemani ekrana yazdirmak
		System.out.println(arr2[2]);//10
		System.out.println(arr2[3]);//14
		System.out.println(arr2[0]);//ilk eleman her zaman böyle yazdirilir
		
		int arr3[]= { 21,22,23,24,25,26 ,27,2023 };
		System.out.println(arr3[arr3.length-1]);//2023 son eleman herzaman arrayismi[length-1] ile bulunur
		
		//bir Array olusturunuz  bu array'in tüm elemanlarini for-loop kullanarak ekrana
		//ayni satirda aralarina bosluk koyarak yazdiriniz
		int arr4[]= {3,6,9,12,15,18,21,24,27,30};
		
		for (int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
			}
			
		//bir ARRAY olusturunuz.bu array'in  indexi cift sayi olan elemanlarini 
		//while --lop döngüsü kullanarak ayni satirda ekrana yazdiriniz
		int arr5[]= {2,3,5,7,11,13,17,19,23,29,31,37,41 };
		
	int i=0;
	System.out.println();
		while (i<arr5.length) {
			if(i%2==0) {
				System.out.print(arr5[i]+" ");
				}
			i++;
		}
			
			
			
		
		
		
	}

}
