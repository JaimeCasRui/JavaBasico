package EjerciciosBasicos;

public class ArraysBidimensionales {
	public class PruebasArraysNDimesionales {
		public static void main(String[] args) {
			
			int[][] array2D = new int[4][3];
			
			for (int i = 0; i < array2D.length; i++) {
				for (int j = 0; j < array2D[i].length; j++) {
					array2D[i][j] = 1;
				}
			}
			
			for (int i = 0; i < array2D.length; i++) {
				for (int j = 0; j < array2D[i].length; j++) {
					System.out.print(array2D[i][j] + " ");
				}
				System.out.println();
			}
			
		}
	}
}
