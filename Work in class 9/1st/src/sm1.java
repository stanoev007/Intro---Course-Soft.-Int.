
public class sm1 {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 2, 5 };
		int[] b = new int[] { 5, 1, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
