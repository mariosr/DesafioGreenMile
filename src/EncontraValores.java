public class EncontraValores {

	public static void main(String[] args) {

		int array[] = { 1, 3, 2, 7, 5 };

		int s = 6;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int a = array[i];
				int b = array[j];
				if ((a + b) == s) {
					System.out
							.println("Array[" + i + "]" + " Array[" + j + "]");
				}
			}
		}
	}
}
