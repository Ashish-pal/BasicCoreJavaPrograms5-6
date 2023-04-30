package day5_6;

import java.util.*;

public class VowelConsonent {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character: ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Alphabet is vowel");
                break;
            default:
                System.out.println("Alphabet is consonent");
                System.exit(0);
        }
    }
}
