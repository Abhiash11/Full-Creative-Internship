package week2;

public class Wrapper3 {

	public static void main(String[] args) {
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  
		  
		//Autoboxing: Converting primitives into objects  
		Byte bobj=b;  
		Short sobj=s;  
		Integer iobj=i;  
		Long lobj=l;  
		Float fobj=f;  
		Double dobj=d;  
		Character cobj=c;  
		Boolean boolobj=b2;  
		  
		//Printing objects  
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+bobj);  
		System.out.println("Short object: "+sobj);  
		System.out.println("Integer object: "+iobj);  
		System.out.println("Long object: "+lobj);  
		System.out.println("Float object: "+fobj);  
		System.out.println("Double object: "+dobj);  
		System.out.println("Character object: "+cobj);  
		System.out.println("Boolean object: "+boolobj);  
		  
		//Unboxing: Converting Objects to Primitives  
		byte bytevalue=bobj;  
		short shortvalue=sobj;  
		int intvalue=iobj;  
		long longvalue=lobj;  
		float floatvalue=fobj;  
		double doublevalue=dobj;  
		char charvalue=cobj;  
		boolean boolvalue=boolobj;  
		  
		//Printing primitives  
		System.out.println("---Printing primitive values---");  
		System.out.println("byte value: "+bytevalue);  
		System.out.println("short value: "+shortvalue);  
		System.out.println("int value: "+intvalue);  
		System.out.println("long value: "+longvalue);  
		System.out.println("float value: "+floatvalue);  
		System.out.println("double value: "+doublevalue);  
		System.out.println("char value: "+charvalue);  
		System.out.println("boolean value: "+boolvalue);  

	}

}
