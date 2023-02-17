package week2;

public class MethodOverloading1 {
	void display(int num)
	{
		System.out.println("number is: "+num);
	}
	void display(int n1, int n2) {
		System.out.println("number 1 is : " + n1
                + "  \nnumber 2 is : " + n2);
	}

	public static void main(String[] args) {
		MethodOverloading1 obj= new MethodOverloading1();
		obj.display(6);
		obj.display(7,3);
		
		
	}

}
