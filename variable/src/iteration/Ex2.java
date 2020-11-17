//package iteration;
//
//import java.util.Scanner;
//
//public class Ex2 {
//	public static void main(String[] args) {
//
//		int input;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		input = sc.nextInt();
//
//		for (int i = 0; i < input; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//package iteration;
//
//import java.util.Scanner;
//
//public class Ex2 {
//	public static void main(String[] args) {
//
//		int input;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		input = sc.nextInt();
//
//		for (int i = 0; i < input; i++) {
//			for (int j = 1; j < input - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");			
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

package iteration;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		int rbalance = 0;
		int pick;
		String pick2;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택 : ");
			pick = scanner.nextInt();

			switch (pick) {
			case 1:
				System.out.print("예금하실 금액을 입력해주세요 : ");
				balance += scanner.nextInt();
				System.out.println("예금액 : " + balance);
				break;
			case 2:
				if (balance == 0) {
					System.out.println("잔액이 없습니다.");
					break;
				} else if (balance >= 0) {
					System.out.print("출금하실 금액을 입력해주세요 : ");
					rbalance = scanner.nextInt();
					if (rbalance > balance) {
						System.out.println("잔액이 부족합니다.");
					} else {
						balance -= scanner.nextInt();
						System.out.println("잔액 : " + balance);
						break;
					}
				}
			case 3:
				System.out.println("잔고는 " + balance + "원 입니다.");
				break;
			default:
				System.out.println("종료 : y , 이전 단계로 돌아가려면 아무 키를 눌러주세요.");
				pick2 = scanner.next();
				if (pick2.equals("y")) {
					run = false;
				} else {
					break;
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}