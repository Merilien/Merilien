//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorio(5));

    }

    public static int factorio(int num){
        int factorial = 1;
        for (int a = 1; a <= num; a++){
            factorial *= a;
        }
        return factorial;
    }

}
