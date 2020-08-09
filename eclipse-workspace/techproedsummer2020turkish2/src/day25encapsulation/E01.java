package day25encapsulation;

public class E01 {
	
	
	private int sifre=123456;
	private String isim="Ali Can";
	
	private double pi=3.14;
	private char ch='A';
	

	public static void main(String[] args) {
		
		/*1)Encapsulation==> DATA SAKLAMAK"(Data hiding)"  demektir.
		 *2)!!!Encapsulation Yapmak icin variable'leri "private" yapariz.!!!(sadece class'dakiler görebilir)
		 *3)Encapsulation YAPTIGINIZ Variable'i a)okumak 2)degistirmek icin acabilirsiniz
		 *
		*/
		
		//soru )variable olustur Encapsulation yapiniz
		//diger class'da okunmasi icin  gerekeni yap
		//varible diger classlardan okuyunuz
	}	
	
	/*Encapsulation yaptiginiz variable'in baska class'lardan okunabilmesi ni isterseniz 
	 * getter method olusturmaniz gerekir
	 * variable neyse return type da o olmalidir
	 * geter olusturmak icin
	 * 1)AccesModifier public olsun
	 * 2)return Type VARIABLE'in return type ile ayni olmali
	 * 3)Isim get+variable ismi seklinde olsun
	 * 4)Method'un icinde "return variable ismi " yazilsin 
	 */
	
	//seter olusturmak icin
	//1)Acces modifier her zaman public
	//"return type her zaman void
	//method ismi "set+variable ismi" seklinde yaziniz
	//4) method parantezi icine variable'i return type ile beraber yaziniz
	//5)method badisi icine "this.ch=ch" gibi yaziniz (variable ismi ch ise)
	
	
		
	public int getSifre() {
		return sifre;
		
	}
		public String getIsim() {
			return isim;
			
		}
		
		public double getPi() {
			return pi;
			
		}
public char getCh() {
	return ch;
	
}
	public void setSifre(int sifre) {
		this.sifre=sifre;
		
	}

	public void setIsim(String isim) {
		this.isim=isim;
	}
}
