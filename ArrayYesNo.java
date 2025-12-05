package placement;

import java.util.Scanner;

public class ArrayYesNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array element");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter search element");
		int a = sc.nextInt();
		ArrayYesNo.searchNumber(arr, a);
		
		}

	public static void searchNumber(int arr[], int a) {
		boolean found = false;
		for (int K : arr) {
			if (K == a) {
				found = true;

			}
		}
		if(found) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}
}
