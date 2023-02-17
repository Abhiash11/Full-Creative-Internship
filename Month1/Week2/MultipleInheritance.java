package week2;

interface A{
	void print();}
interface B{
	void show();}

public class MultipleInheritance implements A,B {
	public void print()
	{
		System.out.println("message of A");
		}
	public void show()
	{
		System.out.println("message of B");
		}

	public static void main(String[] args) {
		MultipleInheritance obj= new MultipleInheritance();
		obj.print();
		obj.show();
	}

}
