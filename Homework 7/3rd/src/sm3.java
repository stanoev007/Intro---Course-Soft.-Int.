import java.util.Scanner;

public class sm3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи а: ");
		int a = input.nextInt();
		System.out.println("Въведи b: ");
		int b = input.nextInt();
		if(a > b){
			System.out.println("Числото b трябва да е по - голямо от a!");
		}
		for (int i = 0; i < b; i++) {
			if(i % 3 == 0){
				System.out.println(i);
			}
		}
		input.close();

	}

}
