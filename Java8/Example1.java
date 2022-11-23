package interfacesJava8;
interface B{
	//abstract method -> method without body only method declaration
	
	void show();
	
	//default methods -> method with body that is method defn can also be  provide
	// by using default keyword infront of the method
	/**Java 8 Feature**/
	default void display() {
		System.out.println("Method with Body -> default methods");
	}
	
	static void m1() {
		System.out.println("Its static method m1");
	}
	
}
public class Example1 implements B {

	@Override
	public void show() {
		System.out.println("Abstract method - implementation in the class Example1");
		
	}
	
	public static void main(String[] args) {
//		Example1  e = new Example1(); //Example1 is the class I implemented the interface B
//		
//		e.show();
//		e.display();
		
		B.m1();
	
	}

}
