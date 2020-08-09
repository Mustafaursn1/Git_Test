package day30;

public class TryCatch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			hop();
		}catch (Exception e) {
			System.out.println(e);//java.lang.RuntimeException: cannot hop
		}
			
			
		}

		private static void hop() {
			throw new RuntimeException("cannot hop");
		}
	}
