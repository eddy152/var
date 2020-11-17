package iteration;
import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + "단");
//			System.out.println("===========");
//			for (int q = 1; q < 10; q++) {
//				System.out.println(i + " * " + q + " = " + i*q );
//			} System.out.println("===========");
		int i = 1;
		int sum = 0;
		int input;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n번까지의 합을 구할 숫자를 입력하세요 : ");
		input = sc.nextInt();
		
		
		while (true) {
			sum += i;
			if(i == input) {
				break;
			}
			i++;
		}
		System.out.println("1부터 " + input + "까지의 합 : " + sum);

	}
}
