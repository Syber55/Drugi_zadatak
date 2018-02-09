import java.util.Scanner;

public class Metode {
	public static int[] eliminateDuplicates(int[] list) {
		int[] niz = list;
		return niz;
	}

	public static boolean isSorted(int[] list) {
		boolean provjera = false;
		return provjera;
	}

	public static String sort(String s) {
		String sortirano = "";
		return sortirano;
	}

	public static double sumMajorDiagonal(double[][] m) {
		double suma = 0;
		return suma;
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sumaKolone = 0;
		for (int i = 0; i < m.length && i < m[0].length; i++) {
			sumaKolone += m[i][i];
		}
		return sumaKolone;
	}

	public static void sort(int m[][]) {
		m = twoDimensionalSortingRow(m);
		m = twoDimensionalSortingColumn(m);
		
	}

	public static int[][] twoDimensionalSortingRow(int n[][]) {
		int a = 0;
		for (int i = 1; i < n.length; i++) {
			if (n[i - 1][0] > n[i][0]) {
				a = n[i - 1][0];
				n[i - 1][0] = n[i][0];
				n[i][0] = a;
			}
		}
		return n;
	}
	
	public static int[][] twoDimensionalSortingColumn(int n[][]){
		int a = 0;
		for (int i=1; i<n[0].length; i++) {
			if (n[0][i-1] > n[0][i]) {
				a = n[0][i-1];
				n [0][i-1] = n[0][i];
				n[0][i] = a;
			}
		}
		return n;
	}

}
