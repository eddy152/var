package variable;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		double num1;
		double num2;
		String resultStr = "결과값은 ";

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		num1 = sc.nextDouble();
		System.out.print("값2를 입력하세요 : ");
		num2 = sc.nextDouble();
		double result = num1 - num2;

		if (result > 0) {
			System.out.println(resultStr + result);
		} else {
			System.out.println(resultStr + (num2 - num1));
		}

	}

}