package placement;

import java.util.Scanner;

public class TwoDimArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter  value of row" + (i + 1) + "col" + (j + 1));
				arr[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 1 && arr[i][j] <= 50) {
					count++;
				}
				if (arr[i][j] > 50 && arr[i][j] < 100) {
					count1++;
				}
				if (arr[i][j] > 100) {
					count2++;
				}

			}

		}
		System.out.println("below 50:" + count);
		System.out.println(" above 50 below 100:" + count1);
		System.out.println("above 100:" + count2);

	}
}
