import java.util.Scanner;

public class sm1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("�������� ���: ");
		String b = a.nextLine();
		n(b);
		a.close();

	}
	public static void n(String name){
		System.out.println("Greetings, " + name);
	}

}
