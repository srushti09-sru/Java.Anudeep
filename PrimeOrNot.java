package placement;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
//		for (int i = 2; i*i <num; i++) {
//			if (num % i != 0) {
//				System.out.println("num is prime");
//			   break;
//			} else {
//				System.out.println("num is not prime");
//				break;
//			}
//		}
//	}
//
//}
		
		boolean isprime=true;
		if(num==1)
			isprime=false;
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				isprime=false;
				
			}
		}
			if(isprime)
			System.out.println("num is prime");
				
			else
				System.out.println("not prime");
		
		
	}
}
		