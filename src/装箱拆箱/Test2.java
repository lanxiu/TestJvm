package 装箱拆箱;

public class Test2 {
	
	
	
	public static void main(String[] args) {
		Integer b =2 ;
		Integer c =3;
		Integer d =3;
		Integer e =321;
		Integer f = 321;
		Long g =3L;

		Integer d2 = new Integer(3);
		Integer a =1;
		int a1=1;
		int a2=new Integer(1);
		

		System.out.println(a ==a1);
		System.out.println(a ==a2);
		
		int vv = 3;

		Integer h =vv;
		Integer h1=vv;
		Integer h2=new Integer(vv);
		Integer h3=new Integer(vv);
		System.out.println("h ==h1" + (h ==h1));
		System.out.println("h ==h2" +  (h ==h2));
		System.out.println("h1 ==h2" +  (h1 ==h2));
		System.out.println("h2 ==h3" +  (h3==h2));
		System.out.println("h2 equal h3 " +  (h3.equals(h2)));
		Integer j =256;
		Integer j1=256;
		Integer j2=new Integer(256);
		System.out.println("j ==j1" + (j ==j1));
		System.out.println("j ==j2" +  (j ==j2));
		System.out.println("j1 ==j2" +  (j1 ==j2));
		
		

		System.out.println(c ==d);
		System.out.println(a ==a1);
		System.out.println("c ==d2" + (c ==d2));
		System.out.println(e==f);
		System.out.println( c == (a+b));
		System.out.println(c.equals(a+b));
		System.out.println(g == (a+b));
		System.out.println(g.equals(a+b));
		
	}
	
	public void aa() {
		if(true) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
		 
	}

}
