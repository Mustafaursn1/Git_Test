package day24accessmodifierstringbuilder;

public class SB01 {

	public static void main(String[] args) {
		
		/*String class her degisim icin yeni bir STRING olusturur
		 * var olan String 'i degistirmez bu yüzden String'ler immutable(DEGISTIRILIMEZ) DIYORUZ
		 * 
		 * String Builder ise degisime aciktir yeni String olusturmadan var olani degistirmek mümkündür
		 * StringBuilder 'lar ise " mutable "(degistirilibilir) demektir
		 */
		//StringBuilder ile String olusturmak icin 3 yol var
		//1.yol
		StringBuilder stb1=new StringBuilder();
		
		System.out.println(stb1);//  burda bos hic bir sey yazdirmaz
		
		stb1.append("Java");
		System.out.println(stb1);//Java
		
		
		stb1.append("Kolaydir");
		System.out.println(stb1);//JavaKolaydir
		
		//2.yol
		StringBuilder stb2=new StringBuilder(5);//5 anlami==> 5 karekterli bir String olusturacagiz demek
		stb2.append("ALI");
		System.out.println(stb2);
		stb2.append(" Kazandi");
		System.out.println(stb2);//ALI Kazandi
		
		//3.yol
		StringBuilder stb3=new StringBuilder("Java");
		System.out.println(stb3);//Java
		
		/*Soru 
		 *  1)3.YOL ILE bir String olusturunuz
		 *  2)bu stringe ekleme yapiniz
		 *  §)bu string'in belli bir bölümünü ekrana yazdir
		 */
		StringBuilder stb4=new StringBuilder("Bu havada");
		stb4.append(" gidilmez").append(" kararsiz kaldim");//tekrat tekrar method kullanmaya "method chain "denir
		System.out.println(stb4.substring(0, 7));//Bu hava
		System.out.println(stb4);//Bu havada gidilmez kararsiz kaldim
        
		System.out.println(stb4.charAt(3)); //h
		System.out.println(stb4.delete(7, 13 ));//Bu havailmez kararsiz kaldim
		
		//!!!delete method'unda  1.parametre dahil,2.parametre dahil degildir
		System.out.println(stb4.getClass());//class java.lang.StringBuilder objenin olusturuldugu class
        System.out.println(stb4.indexOf("havada"));
	    System.out.println(stb4.insert(2, " kis kar yagmadi"))	;//Bu kis kar yagmadi havailmez kararsiz kaldim
        System.out.println(stb4.lastIndexOf("a"));//39
		System.out.println(stb4.length());//44
		System.out.println(stb4.replace(2, 19, "(burda bazi seyler silindi)"));
		//Bu(burda bazi seyler silindi)havailmez kararsiz kaldim
		
		
		//String'i tersten  yazdirma
		String s="";
		for(int i=stb4.length()-1;i>=0;i--) {
			s=s+stb4.charAt(i);
			
		}
		System.out.println(s);//midlak zisrarak zemliavah)idnilis relyes izab adrub(uB
		System.out.println(stb4.reverse());//midlak zisrarak zemliavah)idnilis relyes izab adrub(uB
		
		stb4.setCharAt(5, 'x');
		System.out.println(stb4);//midlax zisrarak zemliavah)idnilis relyes izab adrub(uB
		
	//capacity() ile length() farki
		
		StringBuilder stb5=new StringBuilder(11);
		stb5.append("javammmmmmmmmmmmmmmm");
		System.out.println(stb5.capacity());//24 (2capacity+2)
		System.out.println(stb5.length());//20
		/*belirlenen kapasiteyi gecerseniz kapasite belirlenen kapasitenin 2 katinin 2 fazlasi olarak yazilir 
		 * b kapasitenin 2 katinin 2 fazlasini da gecersiniz capacity() ile length() ayni olur
		*/
		//!!!önemli not
		StringBuilder stb6=new StringBuilder("Java kolay");
		stb6.append("x");
		System.out.println(stb6);//Java kolayx
		//substring String Class'inin method'udur
		//StringBuilder' bu yüzden update edemez
		stb6.substring(8);
		System.out.println(stb6);
			
		
		
		
		

	}

}
