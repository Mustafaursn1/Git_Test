package day31abstraction;

public class KralDairesi  extends Otel{

	public static void main(String[] args) {
		
		KralDairesi krl =new KralDairesi();
		krl.cay();
		krl.kahvalti();
		krl.wifi(4);
		
	}

	@Override
	public void kahvalti() {
		System.out.println("kahvalti mutluluktur");
		
		
	}
@Override
	public void cay() {
	System.out.println("7/24 cayservisi");
		
	}

public int tv(String international,int saat) {
	return saat*5;
	
}
}
