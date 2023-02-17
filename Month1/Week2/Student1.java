package week2;

public class Student1 {
	int id;  
	String name;  
	Address address;  
	  
	public Student1(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  

	public static void main(String[] args) {
		Address address1=new Address("lko","UP","india");  
		Address address2=new Address("hyd","TLG","india");  
		  
		Student1 one=new Student1(11, "Abhilash",address1 );  
		Student1 two=new Student1(22, "Uttej",address2);  
		      
		one.display();  
		two.display();  

	}

}
