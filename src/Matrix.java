import java.io.*;
import java.util.*;

public class Matrix {
	int arr[][];
	int r, c;

	Matrix(int r, int c) {
		this.r = r;
		this.c = c;
		arr = new int[r][c];
	}

	int[][] getMatrix() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < r; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int j = 0; j < c; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		return arr;
	}

	int[][] findsum(int a[][], int b[][]) {
		int temp[][] = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				temp[i][j] = a[i][j] + b[i][j];
		return temp;
	}

	void displayMatrix(int res[][]) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

class MatrixSum {

	public static void main(String[] args) throws IOException {

		Matrix obj1 = new Matrix(3, 3);
		Matrix obj2 = new Matrix(3, 3);
		int x[][], y[][], z[][];
		System.out.println("\n Enter element of first matrix: ");
		x = obj1.getMatrix();
		System.out.println("\n enter element of second matrix: ");
		y = obj2.getMatrix();
		z = obj1.findsum(x, y);
		System.out.println("\n the sum matrix is:");
		obj2.displayMatrix(z);

	}

}
