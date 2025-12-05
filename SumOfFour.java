package placement;

import java.util.Scanner;

public class SumOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
		System.out.println("enter third number");
		int num3 = sc.nextInt();
		sum = sum + num3;
		System.out.println(sum);
		System.out.println("enter fourth number");
		int num4 = sc.nextInt();
		sum = sum + num4;
		System.out.println(sum);
	}
}
