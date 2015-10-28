
public class sm {

	public static void main(String[] args) {
		int a = 9;
		if (a >= 1 && a <= 5) {
			if (a % 2 == 0) {
				System.out.println("The number si even");

			} else {
				System.out.println("The number is odd");

			}
		} else if (a >= 6 && a <= 15) {
			if (a % 3 == 0) {
				System.out.println("chisloto se deli na 3");

			} else {
				System.out.println("chisloto ne se deli na 3");
			}
		} else {
			if (a > 0) {
				System.out.println("chisloto e po golqmo ot nula");
			} else if (a < 0) {
				System.out.println("Chisloto e po malko ot nula");

			} else {
				System.out.println("Chisloto e ravno na nula");
			}
		}

	}

}
