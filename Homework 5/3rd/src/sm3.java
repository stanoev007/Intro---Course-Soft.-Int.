import java.util.Scanner;

public class sm3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("������ n: ");

		int max = -350;
		int min = 350;

		for (int i = 1; i < 6; i++) {
			int n = a.nextInt();
			if (n > max) {
				max = n;

			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}
}