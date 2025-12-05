package placement;
import java.util.*;
public class SwitchPizza {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		String size=sc.nextLine();
		int small=125;
		int medium=250;
		int large=300;
		int verylarge=350;
		
		switch(size){
		case "small":
			System.out.println("125");
			break;	
		case "medium":
			System.out.println("250");
			break;
		case "large":
			System.out.println("300");
			break;	
		case "verylarge":
			System.out.println("350");
			break;	
		default:System.out.println("invalid");
	}
	}	

}
