package placement;

import java.util.Scanner;

public class StudentObj {
	int id;
	String name;
	double fees;

	public StudentObj(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StudentObj std[] = new StudentObj[2];
		for (int i = 0; i < std.length; i++) {
			System.out.println("Enter the id of student");

			int id = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter fees");
			Double fees = sc.nextDouble();
			std[i] = new StudentObj(id, name, fees);
		}
		System.out.println(std[0].id);
		System.out.println(std[0].name);
		System.out.println(std[1].name);
	}
}
