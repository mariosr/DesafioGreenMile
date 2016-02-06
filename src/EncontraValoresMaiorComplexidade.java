import java.util.Scanner;

public class EncontraValoresMaiorComplexidade {

	private static Scanner sc;

	public static void main(String[] args) {
		
		// array de valores
		int array[] = { 1, 3, 2, 7, 5 };
			
		sc = new Scanner(System.in);
		System.out.println("Digite um valor para S: ");
		int s = sc.nextInt();

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
