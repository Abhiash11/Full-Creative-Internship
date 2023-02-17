package week2;

class Demo{
	   static int val;
	   int val_2;
	   static{
	      val = 45;
	      System.out.println("The static block has been called.");
	   }
	   
	}
	public class StaticBlock1{
	   public static void main(String args[]){
	      System.out.println(Demo.val);
	   }
	}