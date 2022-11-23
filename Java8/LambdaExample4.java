package interfacesJava8;

@FunctionalInterface
interface Animal{
	void makeSound();
}

public class LambdaExample4 {
  public static void main(String[] args) {
	  
	
	  Animal dog = () -> System.out.println("Wow wow");
	  
	  dog.makeSound();
	   
	   Animal cat = () -> System.out.println("meow meow");
	   
	   cat.makeSound();
	   
	  /**Step1**/
	   //FunctionalInterface <referencename> =  () -> line1  ;
	   //FunctionalInterface reference name> = () -> { //line 1; //line2};
	   
	   /**Step2**/
	   //calling 
	   //referencename.abstractmethodname()
	   
	   Animal human = () -> {
		   System.out.println("Human is not an animal");
		   System.out.println("Making sound.. they talk");
	   };
	
	   human.makeSound();
	   
	   Animal snake=() -> System.out.println("sss sss");
	   snake.makeSound();
	   
	   Animal lion=() ->System.out.println("lions r oar");
	   lion.makeSound();

	   Animal Owl = () -> System.out.println("Howl");
		Owl.makeSound();
		
		Animal Goat = () -> System.out.println(" mhe mhe");
		Goat.makeSound();
		
		Animal pig = ()-> System.out.println("pig woww");   
		pig.makeSound(); 
		
		Animal parrot=()-> System.out.println("kikck"); 
		parrot.makeSound();  

		Animal cow =() -> System.out.println("Amba");
		cow.makeSound();



	  
}
}
