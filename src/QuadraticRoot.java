package day5_6;
import java.util.Scanner;
public class QuadraticRoot {
    public static void calDeterminent(double a, double b, double c) {
        double r1, r2;
        double determinent = b * b - 4 * a * c;
        if (determinent > 0) {
            r1 = (-b + Math.sqrt(determinent)) / (2 * a);
            r2 = (-b - Math.sqrt(determinent)) / (2 * a);
            System.out.println("root1= " + r1 + "root2= " + r2);
        } else if (determinent == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.println("root1 = root2 = " + r1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinent) / (2 * a);
            System.out.format("root1= %.2f+%.2fi", real, imaginary);
            System.out.format("root2= %.2f+%.2fi", real, imaginary);
        }
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticRoot obj = new QuadraticRoot();
        obj.calDeterminent(a, b, c);
    }
}