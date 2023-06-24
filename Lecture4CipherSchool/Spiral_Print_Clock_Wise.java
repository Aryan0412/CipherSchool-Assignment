package Lec14;

import java.util.Scanner;

public class Spiral_Print_Clock_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for (int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Spiral(arr);

	}

	public static void Spiral(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int count = 0;
		while (count < total) {
			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.print(arr[minr][i] + ", ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.print(arr[i][maxc] + ", ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.print(arr[maxr][i] + ", ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.print(arr[i][minc] + ", ");
				count++;
			}
			minc++;
		}
		System.out.print("END");
	}

}
