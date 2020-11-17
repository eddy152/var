package condition;

import java.util.Scanner;

public class ConditionExample {
	public static void main(String[] args) {
		int score;
		String grade = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else if{
				grade = "A";
			} if (score >= 80) {
				grade = "B"; 
			} else if (score >= 85) { 
					grade = "B+";
			} if (score >= 70) {
				grade = "C"; 
			} else if (score >= 65) { 
					grade = "C+";
			} if (score >= 60) {
				grade = "D"; 
			} else {
				grade = "F";
			}
		}
		System.out.println("시험 등급은 : " + grade + " 입니다.");
	}
}