import java.util.Scanner;

public class sm2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("My points: ");
		
		int a = input.nextInt();
		int b = 5;
		int c = a*b;
		int d = 10;
		int e = a*d;
		int f = 50;
		int g = a*f;
		if(a>=10){
			System.out.println("Error");
		}
		if(a>=1 && a<=3){
			System.out.println(c);
		}else if(a>=4 && a<=6){
			System.out.println(e);
		}else if(a>=7 && a<=9){
			System.out.println(g);
		}
		input.close();
	}

}
