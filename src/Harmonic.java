package day5_6;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        int n;
        double i, s = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for harmonic value: ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("Entered Value is 0, Value error, enter correct Value");
            System.exit(0);
        } else {
            for (i = 1; i <= n; i++) {
                s = s + 1 / i;
            }
        }
        System.out.println("Harmonic Value: " + s);
    }
}