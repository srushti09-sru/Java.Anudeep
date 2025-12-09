package placement;

public class Student {
	int id;
	String first_name;
	String last_name;
	double fees;
	
	public Student(int id,String first_name,String last_name,double fees) {
		this.id=id;
		this.first_name=first_name;
		this.last_name=last_name;
		this.fees=fees;
	}
	
	public void getName() {
		System.out.println("Student Name is:"+first_name+" "+last_name);
	}
	
	public void getFees() {
		System.out.println("Fees:"+fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student(39,"srushti","ganji",25000.00);
		System.out.println("Student id:"+stu.id);
		stu.getName();
		stu.getFees();
		
		Student stu1=new Student(17,"Saakshi","gouda",21000.00);
		System.out.println("Student id:"+stu1.id);
		stu1.getName();
		stu1.getFees();
		
		Student stu2=new Student(58,"Laxmi","pugati",20000.00);
		System.out.println("Student id:"+stu2.id);
		stu2.getName();
		stu2.getFees();
	}

}
