import java.util.Scanner;

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
public class AverageOfInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integers!");
        int sum = 0;
        for (int a = 0; a < 5; a++){
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum + ", Average: " + sum/5);
    }
}