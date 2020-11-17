package iteration;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하세요 : ");
		height = sc.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
