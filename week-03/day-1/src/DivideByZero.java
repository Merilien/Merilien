// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {
        try{
            System.out.println(divideTen(0));
        } catch (ArithmeticException exception) {
            System.out.println("Can't divide by zero!");
        }
    }

    public static int divideTen(int num){
        return 10/num;
    }
}
