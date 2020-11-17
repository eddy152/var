package OperatorExample1;
import java.util.Scanner;
public class OperatorExample1 {

	public static void main(String[] args) {

//		int num1 = 3;
//		int result = 0;
//
//		if (result == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		} else if (num1 % result == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
//
//		String r = (result == 0)? "0으로는 나눌 수 없습니다.":
//		(num1 % result == 0)? "짝수입니다.":"홀수입니다.";
//		System.out.println(r);	

		int num1;
		boolean result;
		System.out.println("Ture : 짝수 , False : 홀수");
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		num1 = sc.nextInt();
		
//		if (num1 % 2 == 0) {
//			result = true;
//			System.out.println(result);
//		} else {
//			result = false;
//			System.out.println(result);
//		}

		result = (num1 % 2 == 0) ? true : false;
		System.out.println(result);
	}
}