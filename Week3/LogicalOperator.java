package week3;

public class LogicalOperator
{
    public static void main (String[]args)
    {
        int a = 10;
        System.out.println (a < 10 && a < 20);  
        System.out.println (a < 10 || a < 20);  
        System.out.println (!(a < 10 & a < 20)); 
    }
}