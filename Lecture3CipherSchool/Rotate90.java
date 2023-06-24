package Revision;

import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] [] arr = new int [n][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int si = 0;
            int ei = matrix[0].length-1;
            while(si <= ei){
                int temp = matrix[i][si];
                matrix[i][si] = matrix[i][ei];
                matrix[i][ei] = temp;
                si++;
                ei--;
            }
        }

    }
}
