package placement;

import java.util.Scanner;

public class AbsoluteNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println(-+(num));
		}else {
			System.out.println(num);
		}
		
	}

}
