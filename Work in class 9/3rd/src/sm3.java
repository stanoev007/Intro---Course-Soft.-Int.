
public class sm3 {

	public static void main(String[] args) {
		int[] array = {2, 3, 5, 7, 13};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0 && array[i] > max){
				max = array[i];
			}
			if(i % 2 != 0 && array[i] < min){
				min = array[i];
			}
		}
		System.out.println(" The max number of  even index is " + max);
		System.out.println(" The max number of  odd index is " + min);
	}

}
