package week2;
class Bank{
	float interest() {
		return 0;
	}
}
class ICICI extends Bank{
	float interest() {
		return 7.1f;
	}
}

class HDFC extends Bank{
	float interest() {
		return 8.3f;
	}
}
class AXIS extends Bank{
	float interest() {
		return 7.9f;
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Bank b;
		b= new ICICI();
		System.out.println("ICICI:\n Rate Of Interest is: "+b.interest());
		b= new HDFC();
		System.out.println("HDFC:\n Rate Of Interest is: "+b.interest());
		b= new AXIS();
		System.out.println("AXIS:\n Rate Of Interest is: "+b.interest());
		
	}

}
