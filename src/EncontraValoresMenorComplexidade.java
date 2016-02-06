import java.util.Scanner;

public class EncontraValoresMenorComplexidade {

	private static int array[] = { 5, 3, 2, 1, 7 };
	private static Scanner sc;

	public static void main(String args[]) {

		mergeSort(array, 0, array.length - 1);
		
		sc = new Scanner(System.in);
		System.out.println("Digite um valor para S: ");
		int s = sc.nextInt();
		
		buscaBinariaAdaptado(s, array.length, array);

	}
	// complexidade O(logN)
	public static int buscaBinariaAdaptado(int s, int n, int v[]) {
		int e, m, d;
		e = 0;
		d = n - 1;
		// Observe que aqui eu nunca irei gastar O(n^2) porque o vetor sempre será particionado
		// até e == d (no pior caso)...
		for (int i = 0; (i < v.length) && (e <= d); i++) {
			for (int j = 0; j < v.length; j++) {
				
				m = (e + d) / 2;
				
				if (s - v[i] == v[j]){
					System.out.println("Array["+i+"] = " +v[i] +" Array["+j+"] = " +v[j]);
					return 1;
				}
				else if (v[m] >= s){
					System.out.println("diminuindo da metade pro inicio");
					d = m - 1;
				}
				else if (v[m]  + v[j] > s){
					System.out.println("diminuindo da metade pro fim");
					e = m + 1;
				}
	
			}
		}
		return -1;
	}

	// complexidade NLogN
	public static void mergeSort(int[] array, int inicio, int fim) {
		if (fim <= inicio) {
			return;
		}
		int meio = (inicio + fim) / 2;
		mergeSort(array, inicio, meio);
		mergeSort(array, meio + 1, fim);

		int[] A = new int[meio - inicio + 1];
		int[] B = new int[fim - meio];
		for (int i = 0; i <= meio - inicio; i++) {
			A[i] = array[inicio + i];
		}
		for (int i = 0; i <= fim - meio - 1; i++) {
			B[i] = array[meio + 1 + i];
		}
		int i = 0;
		int j = 0;
		for (int k = inicio; k <= fim; k++) {
			if (i < A.length && j < B.length) {
				if (A[i] < B[j]) {
					array[k] = A[i++];
				} else {
					array[k] = B[j++];
				}
			} else if (i < A.length) {
				array[k] = A[i++];
			} else if (j < B.length) {
				array[k] = B[j++];
			}
		}

	}
}
