package day5_6;

import java.util.Scanner;

public class Quo_remainder {
    public static void main(String[] args) {
        int x, y, q, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        if (y != 0) {
            q = x / y;
            r = x % y;
            System.out.println("Quotient: " + q + "   Remainder: " + r);
        } else {
            System.out.println("Divide by zero error");
            System.exit(0);
        }
    }
}