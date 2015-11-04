import java.util.Scanner;

public class third04 {

	public static void main(String[] args) {
		Scanner car = new Scanner(System.in);

		System.out.println("Моля, въведете символ: ");

		String str = car.nextLine();

		switch (str) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "j":
		case "Q":
		case "q":
		case "K":
		case "k":
		case "A":
		case "a":
			System.out.println("Валидна карта");
			break;
		default:
			System.out.println("Невалидна карта");
			break;
		}
		car.close();
	}

}
