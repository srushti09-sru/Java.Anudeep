
package placement;
import java.util.*;
public class AmountDiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Amount");
		double n=sc.nextInt();
	
	 double amt1=n*8/100;
	 double amt2=n*15/100;
	
	 
	 if(n>1000 && n<2000) {
		 System.out.println(n-amt1);
	 }else if(n>2000) {
		 System.out.println(n-amt2);
	 }else {
		 System.out.println(n);
		 
	 }
	 }

}
