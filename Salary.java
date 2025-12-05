package placement;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basic=40000;
		int HRA=5000;
		int DA=3000;
		int other=5000;
		int total_salary=basic+HRA+DA+other;
		System.out.println("total salary:"+total_salary);
		double tax=15/100;
		double deduct=(total_salary * tax);
		System.out.println("total deduct:"+deduct);
		double netsalary=total_salary - deduct;
		System.out.println("Netsalary:"+netsalary);
	}

}
