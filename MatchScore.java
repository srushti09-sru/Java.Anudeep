package placement;

import java.util.Scanner;

public class MatchScore {
                                                          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter score of team A");
		int score1 = sc.nextInt();
		System.out.println("enter score of B");
		int score2 = sc.nextInt();
		if(score1 > score2 && score1<score2+7) {
			System.out.println("team A is winner");
		}else if(score1<score2 && score2<score1+7) {
			System.out.println("team b is winner");
		}else if(score1==score2) {
			System.out.println("match is tie");
//		}else if(score1!=score2+7 && score2!=score1+7) {
//			System.out.println("invalid score");
		}else {
			System.out.println("invallid");
		}
	}

}
