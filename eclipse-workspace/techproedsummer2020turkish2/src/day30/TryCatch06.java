package day30;

public class TryCatch06 {

	public static void main(String[] args) {
		try {
			hop();
		}catch (Exception e) {
			
			e.printStackTrace();
			//daha detayli bilgi verir.Exception ile ilgili.nerede olustugu ile ilgili.
			//olusum sirasina gore verir
			//java.lang.RuntimeException: cannot hop
			//at day30.TryCatch06.hop(TryCatch06.java:14)
			//at day30.TryCatch06.main(TryCatch06.java:7)

		}
	}
		private static void hop() {
			throw new RuntimeException("cannot hop");
	}

}
