import java.util.Scanner;

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
public class CutFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two integers!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b>a) {
            for (int inc = a; inc < b; inc++){
                System.out.println(inc);
            }
        }
        else {
            System.out.println("The second number should be bigger");

        }
    }
}
