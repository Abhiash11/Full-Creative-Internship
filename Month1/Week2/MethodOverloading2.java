package week2;


public class MethodOverloading2 {
	void Addition(int a, int b) {
		System.out.println(a+b);
	}
	void Addition(double a, double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		MethodOverloading2 obj= new MethodOverloading2();
		obj.Addition(1.3, 4.2);
		obj.Addition(6, 8);
	}

}
