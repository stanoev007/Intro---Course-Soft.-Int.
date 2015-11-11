package изпит;

import java.util.Scanner;

public class sm {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Въведи число от 2 до 9: ");
		int b = a.nextInt();
		
		if(b >= 2 && b <= 9){
			int[][] matrix = new int[b][b];
			int[] array = new int [b*b];
			for (int i = 0; i < array.length; i++) {
				array[i] = a.nextInt();
				
			}
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
				sum = sum + array[i];
			}
			int i = 0;
			System.out.println("Сумата на въведените числа е: " + sum);
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					matrix[col][row] = array[i];
					i++;
					
				}
				
			}
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.print(matrix[row][col] + " ");
				}
				System.out.println();
			}
		}else{
			System.out.println("Невалидно число!");
		}
		
	
	
			
		a.close();
	}

}
