package day28overriding;

public class Dog  extends Animal {
	/*1)Parent'teki method'u method signature'ini degistrimeden method body'sini degistererek 
	  Child class'da kullanmaya "Method Overriding" denir
	  
	 2) Parent class'daki private Method()'lar Overriding  edilemez.
	 (neden?O class'a ait oldugu icin )
	 
	 3)final Method()'lar Overriding edilemez
	 final Method()=body son halde demektir bundan dolayi Overriding EDILEMEZLER.
	 Halbuki Overriding'in Amaci Mthod() body degistirerek kullanmaktir.Bu celiskiden
	 dolayi Java final Method()'larin Overriding edilmesine müsaade etmez
	 
	 4)static Method()'lar Override edilmezler.CUNKU static Method() ortak kullanima aciktir
	 Onun body'sini degistirmek herkesi etkiler .Java bu yüzden müsaade etmez
	 
	 5)Overridden=Parent class'daki Overriding edilen method()'a diyoruz 
	 
	 6)Child class'daki override edilmis method'un(Overriding Method) access modifier'i
	 Parent Class'daki Override edieln method'un(Overriden Method) access modifier'indan 
	 daha dar olamaz
	 
	 7)Child class'daki override edilmis method'un return type'i ya parent class'daki 
	 override edilmis method'un return type'i ile ya da onun  child'lerinden biri olabilir
	 
	 
	  */  
	

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sound();//Havlarlar
		dog.numOfFoot();//4 Ayaklari var
		
	}
public void sound() {
	System.out.println("Havlarlar");
}
@Override //"@Override "Annotation(dipnot ,not) diyoruz///kurallari check eder
//asagidaki method'un kurallara uygun olup olmadigini  kont eder.
public void numOfFoot() {
	
	System.out.println("4 Ayaklari var");
}
	
}
