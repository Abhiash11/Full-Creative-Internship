package week2;

class Super_class {
	   int num = 25;

	   // display method of superclass
	   public void display() {
	      System.out.println("display method of superclass");
	   }
	}

	public class Super_keyword extends Super_class {
	   int num = 17;

	   // display method of sub class
	   public void display() {
	      System.out.println("display method of subclass");
	   }

	   public void my_method() {
	      
	      Super_keyword sub = new Super_keyword();

	      super.display();
	      sub.display();

	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ sub.num);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }

	   public static void main(String args[]) {
	      Super_keyword obj = new Super_keyword();
	      obj.my_method();
	   }
	}