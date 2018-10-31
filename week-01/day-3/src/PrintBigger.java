import java.util.Scanner;

// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 2 numbers!");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a>b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
