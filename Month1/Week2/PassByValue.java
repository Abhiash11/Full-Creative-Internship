package week2;

public class PassByValue {

	public static void main(String[] args) {
		int number= 15;
		System.out.println("value before calling display method: "+number);
		display(number);
		System.out.println("value after calling display method: "+number);

	}
	public static void display(int num) {
		System.out.println("value inside display method: "+num);
		num=60;
		System.out.println("value inside display method: "+num);
	}

}
