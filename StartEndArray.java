package placement;
import java.util.Scanner;
public class StartEndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,60,70};
		Scanner sc=new Scanner(System.in);
		System.out.print("enter start index");
		int n=sc.nextInt();
		System.out.print("enter end index");
		int m=sc.nextInt();
		StartEndArray.subArray(arr, n, m);
				
	}
		public static void subArray(int arr[],int n,int m) {
			for(int i=n;i<m;i++) {
				System.out.println(arr[i]);
			}
				
		}
}
