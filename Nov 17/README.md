version  - Java 8

1. default and static methods inside interfaces

An interface is way to achieve 100% of abstraction in java.
Its consists of abstract methods - (method without a body, only method declaration)
implements keyword -> so that we provide method defn in a class
it can't create an object (new A() - not possible becoz A is an interface)
but can be a reference

interface A{ void show(); }
class Apple implements A{}
class Mango implements A{}
class Grapes implements A{}

-> Apple a = new Apple(); or  A a = new Apple()
-> getting an object from a factory method or ioc container using getBean()

A a = new Apple()/ new Mango()/ new Grapes()

a.show();

When? (Factory design pattern)

-> when you have  two or more classes implements the same interface
-> also you can create objects for those classes based on the user need
-> then you can go for interface name as reference  for those objects

interface A{ void show(); }
class Apple implements A{}
class Mango implements A{}
class Grapes implements A{}
Class Factory{//inside this class only you would create an object}
class App{
// you will ask the user what object you want then
// you ask the factory class to give that object
// get object -> you can keep with interface reference
//then you call the methods
}

Why default methods?

interface A{ void show(); default void display(){ s.o.p ("fruits"); }
class Apple implements A{}
class Mango implements A{}
class Grapes implements A{}

If some functionalities common for all the classes that implement the interface,
you can have functionalities defined as default method/static methods


default method

- a method in an interface with a default keyword 
- and has a method body
- when there is one functionalities common for all the classes 
- access using the object created by the class(that implemented the interface)

static method
- a method in an interface with a static keyword 
- and has a method body
- when there is one functionalities common for all the classes 
- you can call method without creating object
Syntax: interfacename.methodname();

2. Functional Interfaces

- is also interface
- but with only one abstract method
- @FunctionalInterface -> that means it has only one abstract
- any number of default/static methods

in built functional interfaces

-> Runnable -> run() -> allows you to provide an implementation code that thread should run
-> Consumer
-> Suppiler
-> Predicate
-> Function

3. Lambda Experession

basically, it provides the defn for the abstract method inside functional interface
anonymus function
achieve functional 

 /**Step1**/
	   //FunctionalInterfacename <referencename> =  () ->  //line
	   //FunctionalInterfacename <reference name> = () -> { //line 1; //line2}
	   
	   /**Step2**/
	   //calling 
	   //referencename.abstractmethodname()

no need for implements, if you use functional interface and lambda expression

4. forEach() methods


5. Anonymous Class
6. Method References

