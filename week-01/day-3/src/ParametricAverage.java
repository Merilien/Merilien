import java.util.Scanner;

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParametricAverage {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int nums = scanner.nextInt();
        for (int a = 0; a< nums; a++) {
            System.out.println("Enter a number!");
            sum += scanner.nextInt();
        }
        double avg = sum/nums;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
