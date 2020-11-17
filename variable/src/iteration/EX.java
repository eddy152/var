package iteration;

public class EX {
	public static void main(String[] args) {
		int height = 3;

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
			System.out.println("");
		}
			for( int i = height; i >= 1; i--) {
				for (int j = height; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 2; j < i; j++) {
					System.out.print("*");
				}
				for (int j = 2; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
		}
	}
}