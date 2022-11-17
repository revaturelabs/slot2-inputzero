package interfacesJava8;

// Print is a Functional Interface with has only one abstract methods
// is show()

@FunctionalInterface
interface Print{ 
	void show();
	//void display(); -> doesn't allow the other abstract -> only 1
	
	default void m1() {
		System.out.println(" m1 is a default methods");
	}
	
	default void m2() {
		System.out.println("m2 is a default methods");
	}
	
}

public class FIExample3 implements Print {

	@Override
	public void show() {
		System.out.println("show in class");
		
	}

}
