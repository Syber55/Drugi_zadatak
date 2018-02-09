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

	//Write a method that returns a sorted string using the following header: public static String sort(String s) For example, sort("acb") returns abc.
	public static String sort(String s) {
		String sortirano = "";
		char[] niz = new char[s.length()];
		int i;
		for (i = 0; i < niz.length; i++) {
			niz[i] = s.charAt(i);
		}
		java.util.Arrays.sort(niz);
		//System.out.println(niz);
		//String novi_string = java.util.Arrays.toString(niz);
		s="";
		for (i = 0; i < niz.length; i++) {
			s += niz[i];
		}
					
		sortirano=s;
		return sortirano;
	}

	public static double sumMajorDiagonal(double[][] m) {
		double suma = 0;
		int n=m.length;
		int i;
		for(i=0; i<n; i++){
			suma += m[i][i];
		}
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
