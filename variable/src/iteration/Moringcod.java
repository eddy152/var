package iteration;

public class Moringcod {
	public static void main(String[] args) {
		int sum7 = 0;
		int sum8 = 0;
		int b = 1;
		int z = 1;

		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;
				System.out.println("7의 " + b + "번째 합 : " + sum7);
				b++;
			} else if (i % 8 == 0) {
				sum8 += i;
				System.out.println("8의 " + z + "번째 합 : " + sum8);
				z++;
			}
		}
		System.out.println("sum7 = " + sum7);
		System.out.println("sum8 = " + sum8);
	}
}

//package iteration;
//
//public class Moringcod {
//	public static void main(String[] args) {
//		int sum7 = 0;
//		int sum8 = 0;
//		int i = 1;
//		int b = 1;
//		int z = 1;
//
//		while (i <= 50) {
//			if (i % 7 == 0 && i % 8 == 0) {
//				System.out.println("7과 8의 공통배수입니다. 종료합니다.");
//				break;
//			} else if (i % 7 == 0) {
//				sum7 += i;
//				System.out.println("7의 " + b + "번째 합 : " + sum7);
//				b++;
//			} else if (i % 8 == 0) {
//				sum8 += i;
//				System.out.println("8의 " + z + "번째 합 : " + sum8);
//				z++;
//			}
//			i++;
//		}
//		System.out.println("sum7 = " + sum7);
//		System.out.println("sum8 = " + sum8);
//	}
//}
