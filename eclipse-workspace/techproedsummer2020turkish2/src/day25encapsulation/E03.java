package day25encapsulation;

public class E03 {
	private byte yas=23;
	private float borc=6500.0f;
	private String isim="Kemal Dogru";
	private boolean zengin=true;

	//java boolean 'lar icin getter olusturuken method ismini "is " ile baslar
	//setter'larda set kullanmaya devam ediyoruz
	
	public static void main(String[] args) {
		
		
		
		
		
		

	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}

	

	public void setBorc(float borc) {
		this.borc = borc;
	}

	public String getIsim() {
		return isim;
	}
	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

	

}
