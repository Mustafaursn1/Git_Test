package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		
		
		
		
		E01 obj=new E01();//consractor
		System.out.println(obj.getSifre()); //123456
		E01 obj1=new E01();
		System.out.println(obj1.getIsim());//Ali Can
		//soyle de olurdu
		System.out.println(obj.getIsim());//Ali Can
		
		System.out.println(obj.getPi());//3.14
		System.out.println(obj.getCh());//A
		
		obj.setSifre(98765);
        System.out.println(obj.getSifre());//98765
        obj.setIsim("KEMAL TAHIR");
        System.out.println(obj.getIsim());//KEMAL TAHIR
        E03 ob=new E03();
        System.out.println(ob.getIsim());//Kemal Dogru
        System.out.println(ob.getYas());//23
        
        ob.setBorc(2300.24f);//borc degistirildi ama okuyamiyorum cünkü geter yok
        ob.setYas((byte)25);
        System.out.println(ob.getYas());//25
        
        
        
        
        
	}
	

}
