package placement;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array element");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		bubbleSort(arr);
	
	}
	public static void bubbleSort(int arr[]) {
		int i, j;
		for (i = 0; i < arr.length-1; i++)
			for (j = 0; j < arr.length-i- 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		      System.out.println(Arrays.toString(arr));
		}
}
