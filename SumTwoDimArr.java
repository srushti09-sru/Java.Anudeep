package placement;

public class SumTwoDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 2, 3, 4 }, { 1, 5, 2 }, { 2, 4, 5 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}

		}
		System.out.println("sum:" + sum);
	}
}
