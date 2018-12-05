package fibonacci;

public class Fibonacci {

    public static int calculateFib(int n){
        if (n <= 1){
            return n;
        }
        return calculateFib(n - 1) + calculateFib(n - 2);
    }
}
