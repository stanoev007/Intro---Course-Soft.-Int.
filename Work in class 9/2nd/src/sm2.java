
public class sm2 {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,3,7},
				{6,8,9},
				{2,5,6}
		};
		int max = Integer.MIN_VALUE;
		int maxRow = 0;
		int maxCol = 0;
		int min = Integer.MAX_VALUE;
		int minRow = 0;
		int minCol = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] > max){
					max = matrix [i][j];
					maxRow = i;
					maxCol = j;
				}
				if(matrix[i][j] < min){
					min = matrix[i][j];
					minRow = i;
					minCol = j;
					
			}
				
			}
			
		}
		System.out.println(" The minimal number is " + max +  " The position is: " + minRow + " and " + minCol);
		System.out.println(" The minimal number is " + min +  " The position is: " + minRow + " and " + minCol);
	}
}
