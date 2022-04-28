package praticalfile;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;
		System.out.println("Enter the size of row or column of matrix1 and matrix2");
		row = s.nextInt();
		col = s.nextInt();

		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] sum = new int[row][col];
		System.out.println("Enter the element of matrix1");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the element of matrix2");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = s.nextInt();
			}
		}
		System.out.println("Sum of matrix1 and matrix2");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
