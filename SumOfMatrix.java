package placement;

public class SumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { { 2, 3, 4 }, { 1, 5, 2 }, { 2, 4, 5 } };
		int arr2[][] = { { 1, 8, 5 }, { 2, 5, 3 }, { 2, 7, 1 } };
		int sum[][] = new int[3][3];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];

			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
