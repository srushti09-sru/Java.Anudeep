package placement;

import java.util.Scanner;

public class ReturnTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("enter num2");
		int num2= sc.nextInt();
		if(num1==6 || num2==6 || num1+num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}				
	}

}
