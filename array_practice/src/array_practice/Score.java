package array_practice;

public class Score {
	public static void main(String[]args) {
		int[]scores = {88,81,70,67,20,55,90,95,91};
		for(int i =0;i<scores.length;i++) {
			System.out.printf("學生分數: %d%n", scores[i]);
		}
		for(int score:scores)
			System.out.printf("學生分數 ：%d%n");
	}
}
