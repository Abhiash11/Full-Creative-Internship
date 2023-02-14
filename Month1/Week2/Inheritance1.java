package week2;

class Human1{
	void breathe() {
		System.out.println("breathing...");
	}
}


 class Parent extends Human1 {
	void eat() {
		System.out.println("eating...");
	}
}
 class Child1 extends Parent{
	 void cry() {
		 System.out.println("crying...");
	 }
 }
public class Inheritance1 {

	public static void main(String[] args) {
		Child1 c= new Child1();
		c.breathe();
		c.eat();
		c.cry();

	}

}
