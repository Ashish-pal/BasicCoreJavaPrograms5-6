package day5_6;

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        int i, x, y, z, n;
        Scanner sc = new Scanner(System.in);
        x = 0;
        y = 1;
        System.out.println("Enter the terms upto generate fibonacci series: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {
            z = x + y;
            System.out.println(z + " ");
            x = y;
            y = z;
        }
    }
}