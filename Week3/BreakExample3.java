package week3;

public class BreakExample3 {  
public static void main(String[] args) {  
    
    int i=2;  
      
    do{  
        if(i==7){  
             
           i++;  
           break;//it will break the loop  
        }  
        System.out.println(i);  
        i++;  
    }while(i<=10);  
}  
}  