import java.util.Scanner;

public class fromONEtoN {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.println("������ N: ");

		int n = text.nextInt();

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= n);
		text.close();
	}

}
