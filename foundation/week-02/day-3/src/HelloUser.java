import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner userName = new Scanner(System.in);
        System.out.println("Hello User! What is your name?");
        System.out.println("Hello, " + userName.nextLine() + "!");
    }
}