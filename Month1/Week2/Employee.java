package week2;

    class Employee {
	private int Employee_id;
	private String name;
	
	public int getId() {
		return Employee_id;
	}
	public void setId(int e_id) {
		this.Employee_id= e_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String e_name) {
		this.name= e_name;
	}
}
class Main{
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setId(114981);
		e.setName("Abhilash");
		System.out.println("Employee data:" + "\n Employee ID:" +e.getId()+ "\n Employee name:" +e.getName());

	}
}

