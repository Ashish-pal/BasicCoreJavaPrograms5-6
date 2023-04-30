package day5_6;

import java.io.*;
import java.util.Scanner;

public class Array2D {
    public static void printArray(int[][] arr) {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                pw.print(arr[i][j] + " ");
            }
            pw.println();
        }
        pw.flush();
    }

    public static void main(String args[]) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        printArray(arr);
    }
}