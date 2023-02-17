package week2;
class Wrapper2 {
	  public static void main(String[] args) {

	    // creates objects of wrapper class
	    Integer aObj = Integer.valueOf(16);
	    Double bObj = Double.valueOf(7.46);

	    // converts into primitive types
	    int a = aObj;
	    double b = bObj;

	    System.out.println("The value of a: " + a);
	    System.out.println("The value of b: " + b);
	  }
	}