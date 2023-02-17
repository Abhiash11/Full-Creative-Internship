package week2;

class Human{
	void breathe() {
		System.out.println("breathing...");
	}
}


 class Child extends Human {
	void eat() {
		System.out.println("eating...");
	}
}

class Inheritance2{
	public static void main(String[] args) {
		Child c= new Child();
		c.eat();
		c.breathe();

	}

}
