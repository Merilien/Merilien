import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int dim = scanner.nextInt();
        for (int a = 1; a <= dim; a++){
            String line = "";
            if (a == 1 || a == dim) {
                for (int b = 1; b <= dim; b++) {
                    line += "%";
                }
            }
            else{
                line += "%";
                for (int b = 2; b < dim; b++) {
                    line += " ";
                }
                line += "%";
            }
            System.out.println(line);
        }
    }
}
