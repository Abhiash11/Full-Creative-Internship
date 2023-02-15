package week2;

class Physics{
	void say() {
		System.out.println("This is Physics class");
	}
}
class Topic extends Physics{
	void say() {
		System.out.println("Topic is: Reflection");
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
    Physics p= new Physics();
    p.say();
    Topic t= new Topic();
    t.say();
    
	}

}
