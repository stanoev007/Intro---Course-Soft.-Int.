
public class sm4 {

	public static void main(String[] args) {
		int[][] a = new int [5][6];
		int b = 30;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = b;
				b--;
				System.out.println(a[i][j]);
				
			}
		}

	}

}
