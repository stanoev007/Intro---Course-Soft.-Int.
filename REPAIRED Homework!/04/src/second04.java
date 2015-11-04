import java.util.Scanner;

public class second04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("My points: ");

		int a = input.nextInt();

		if (a >= 10) {
			System.out.println("Error");
		}
		if (a >= 1 && a <= 3) {
			System.out.println(a * 5);
		} else if (a >= 4 && a <= 6) {
			System.out.println(a * 10);
		} else if (a >= 7 && a <= 9) {
			System.out.println(a * 50);
		}
		input.close();
	}

}
