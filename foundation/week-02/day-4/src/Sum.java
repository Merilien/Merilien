//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
public class Sum {
    public static void main(String[] args) {
        System.out.println(sumIt(10));
    }
    public static int sumIt(int num){
        int sum = 0;
        for (int a = 1; a <= num; a++) {
            sum += a;
        }
        return sum;
    }
}
