package week2;

public class PassByReference {

	public static void main(String[] args) {
		int value[]= {90,129};
		System.out.println("value of first element before display method: "+value[0]);
		display(value);
		System.out.println("value of first element after display method: "+value[0]);

	}
	public static void display(int[] num) {
		System.out.println("first elememt inside display method is: "+num[0]);
		num[0]= 100;
		System.out.println("first elememt inside display method is: "+num[0]);

	}

}
