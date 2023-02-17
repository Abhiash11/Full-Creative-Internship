package week2;

class Animal{
	void eats() {
		System.out.println("IS eating");
	}
}
class Cow extends Animal{
	void eats() {
		System.out.println("is Herbivore");
	}
}
class Tiger extends Animal{
	void eats() {
		System.out.println("is Carnivore");
	}
}
class Bear extends Animal{
	void eats() {
		System.out.println("is Omnivore");
	}
}
public class Poly3 {

	public static void main(String[] args) {
		Animal a;
		a= new Cow();
		a.eats();
		a= new Tiger();
		a.eats();
		a= new Bear();
		a.eats();
	}

}
