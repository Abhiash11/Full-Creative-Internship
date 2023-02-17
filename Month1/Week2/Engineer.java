package week2;
class Employee1{
	double salary = 45000;
}

public class Engineer extends Employee1 {
	int bonus= 5000;

	public static void main(String[] args) {
		Engineer e= new Engineer();
		System.out.println("Salary is: " +e.salary);
		System.out.println("Bonus is: " +e.bonus);
		
	}

}
