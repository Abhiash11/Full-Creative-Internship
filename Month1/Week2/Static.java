package week2;

class Static {
	 
    
    static int i;
    
    int j;
 
    
    static
    {
        i = 10;
        System.out.println("static block 1 called ");
    }
 
    // Constructor calling
    Static() {
    	System.out.println("Constructor called"); 
    	}
    Static(int a){
    	i=i*a;
    	System.out.println("Constructor called for variable a: " +a);
    }
    static {
    	System.out.println("static block 2 called ");
    }

 


    public static void main(String args[])
    {
 
        
        Static t1 = new Static();
        Static t2 = new Static(5);
        System.out.println(i);
        
    }}
