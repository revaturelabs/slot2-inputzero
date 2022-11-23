package interfacesJava8;

interface  A {
	void show();
	void display();
}

class Apple implements A{

	@Override
	public void show() {
		System.out.println("Show in Class A");
		
	}

	@Override
	public void display() {
		System.out.println("display in Class A");
		
	}
	
}

public class Example0 {
	
	public static void main(String[] args) {
		
		//creating object with the class reference
		Apple a  = new Apple();
		a.show();
		a.display();
		
		//creating object with the interface reference
		A a2 = new Apple();
		a2.show();
		a2.display();
	}

}
