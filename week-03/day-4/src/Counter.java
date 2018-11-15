public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.

    public static void main(String[] args) {
        countDown(10);
    }

    public static void countDown(int n){
        System.out.println(n);
        if (n == 0){
            return;
        }
        countDown(n - 1);
    }
}
