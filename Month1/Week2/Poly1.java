package week2;

class Bike{
	void run() {
		System.out.println("running");
	}
}

public class Poly1 extends Bike {
	void run() {
		System.out.println("Speed is 70kmph");
	}

	public static void main(String[] args) {
		Bike b= new Poly1();						//upcasting
		b.run();
	}

}
