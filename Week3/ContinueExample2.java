package week3;

public class ContinueExample2 {  
public static void main(String[] args) {  
    //while loop  
    int i=3;  
    while(i<=8){  
        if(i==5){   
            i++;  
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
        i++;  
    }  
}  
}  