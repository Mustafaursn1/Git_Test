package day30;

public class TryCatc02 {
	static String m;

	public static void main(String[] args) {
		
		
		String s ="";
		System.out.println(s.length());//0
		try {
			s+="t";
			
		}catch(Exception e) {
			s+="c";
		}finally {
			s+="f";
		}
		s+="a";
		System.out.println(s);
		//String'e null atandigi zaman  veya intance variable 'a  deger atamadiginizda 
		//length() methodu calismz
		//ve NullPointterException Alirsiniz(run time exception'dir)
		//!!!asagidaki 2 satir da NullPointerException verir.
		//String n=null;
		
		//System.out.println(n.length());
	}

}
