package week2;

public class DefInit {
	int varI;
	   float varF;
	   boolean varB;
	   long varL;
	   byte varBy;
	   short varS;
	   double varD;
	   String s;

	public static void main(String[] args) {
		DefInit obj= new DefInit();
		System.out.println("Default int value ::"+obj.varI);
	      System.out.println("Default float value ::"+obj.varF);
	      System.out.println("Default boolean value ::"+obj.varB);
	      System.out.println("Default long value ::"+obj.varL);
	      System.out.println("Default byte value ::"+obj.varBy);
	      System.out.println("Default short value ::"+obj.varS);
	      System.out.println("Default double value ::"+obj.varD);
	      System.out.println("Default String value ::" +obj.s);
	}

}
