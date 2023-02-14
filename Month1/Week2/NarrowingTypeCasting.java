package week2;

public class NarrowingTypeCasting {

	public static void main(String[] args) {
		double a= 127.8;
		long b= (long)a;
		int c= (int)b;
		System.out.println("before conversion:"+a);
		System.out.println("After conversion to long type: "+b);
		System.out.println("After conversion to int type: "+c);

	}

}
