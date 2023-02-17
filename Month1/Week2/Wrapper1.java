package week2;

public class Wrapper1 {

	public static void main(String[] args) {
		// create primitive types
	    int a = 5;
	    double b = 5.65;

	    //converts into wrapper objects
	    Integer aObj = Integer.valueOf(a);
	    Double bObj = Double.valueOf(b);

	    System.out.println(a+ " \n"+b);

	}

}

