package placement;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter" + n + "elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("array elements");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);

		}
	}
}
