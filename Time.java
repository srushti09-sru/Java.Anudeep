package placement;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter from 1 to 24 time");
		int time=sc.nextInt();
		System.out.println(Time.printTime(time));
	}
	
	
//		boolean value=Time.printTime(time);
//		if(value) {
//			System.out.println("am");
//		}else {
//				System.out.println("pm");
//
//		}
//		
//	}
//	public static boolean printTime(int Time) {
//		if(Time<12 ) {
//			return true;
//	}else {
//		return false;
//	}

	
	 
	public static String printTime(int time) {
		if(time>=1 && time<=12) 
			return "am";
		else if(time>12 && time<=24) 
			return "pm";
		else
			return "invalid";
		}
	}
