import java.util.Scanner;

public class EncontraValores {

	public static void main(String[] args) {
		
		// array de valores
		int array[] = { 1, 3, 2, 7, 5 };
		
		//Digite um valor para S
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para S: ");
		int s = sc.nextInt();
		
		// complexidade O(n^2)
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int a = array[i];
				int b = array[j];
				if ((a + b) == s) {
					System.out.println("Array[" + i + "]" + " Array[" + j + "]");
				}
			}
		}
	}
}
