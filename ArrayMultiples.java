package placement;

import java.util.Scanner;

public class ArrayMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array element");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		printMultiples(arr);
		
	}
		public static void printMultiples(int arr[]) {
			int count=0;
			for(int A:arr){
				if(A%3==0) {
					count++;		
					}
			}
			System.out.println(count);
		}
}
