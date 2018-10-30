//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
public class Sum {
    public static void main(String[] args) {
//        int num = 3;
//        System.out.println(sum(num));
    }
    public static int sum(int numsToSum){
        int sum = 0;
        for (int a=1; a<=numsToSum; a++) {
            sum += a;
        }
        return sum;
    }
}
