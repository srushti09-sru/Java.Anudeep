package placement;

public class Employee {
//	data or feilds
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void getSalary() {
		System.out.println("The salary is:" + salary);
	}

	public void getname() {
		System.out.println("The name is:" + name);
	}

	public static void main(String args[]) {
		Employee emp = new Employee(101, "srushti", 200000.00);
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		emp.getname();
		emp.getSalary();

		Employee emp1 = new Employee(102, "saakshi", 300000.00);
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		emp1.getname();
		emp1.getSalary();

		Employee emp2 = new Employee(103, "Laxmi", 400000.00);
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.salary);
		emp2.getname();
		emp2.getSalary();

	}

}
