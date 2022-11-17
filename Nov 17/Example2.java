package interfacesJava8;

public class Example2  implements B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Example2 e = new Example2();
//		
//		e.show();
//		e.display();
		
		B.m1();
		

	}

	@Override
	public void show() {
			System.out.println("Abstract Method implementation in the class example 2");
	}

}
