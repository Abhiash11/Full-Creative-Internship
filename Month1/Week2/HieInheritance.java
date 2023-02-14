package week2;

class Human2{
	void breathe() {
		System.out.println("breathing...");
	}
}


 class Parent1 extends Human2 {
	void eat() {
		System.out.println("eating...");
	}
}
 class Child2 extends Human2{
	 void cry() {
		 System.out.println("crying...");
	 }
 }

public class HieInheritance {

	public static void main(String[] args) {
		Child2 c= new Child2();
		c.breathe();
		c.cry();

	}

}
