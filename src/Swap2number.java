package day5_6;

import java.util.Scanner;

public class Swap2number {
    public static void main(String[] args) {
        int a, b, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Value before swap: " + a + " " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("Value after swap: " + a + " " + b);
    }
}