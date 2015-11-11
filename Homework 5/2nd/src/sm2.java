import java.util.Scanner;

public class sm2 {

	public static void main(String[] args) {
		Scanner Motorola = new Scanner(System.in);

		System.out.println("Въведи n: ");

		int n = Motorola.nextInt();

		for (int i = 1; i < n; i++) {

			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}

		Motorola.close();
	}

}
