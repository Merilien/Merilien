import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, false));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String advancedBubble(int[] list, boolean descending){
        int len = list.length;
        boolean ready = false;
        if (descending){
            while (ready == false){
            ready = true;
                for (int i = len - 1; i > 0; i--){
                    if (list[i] > list[i-1]){
                        ready = false;
                        int el = list[i];
                        //System.out.println(String.format("Swapped %d & %d", el, list[i+1]));
                        list[i] = list [i-1];
                        list[i-1] = el;
                    }
                }
            }
        }
        else {
            while (ready == false){
                ready = true;
                for (int i = 0; i < len - 1; i++){
                    if (list[i] > list[i+1]){
                        ready = false;
                        int el = list[i];
                        //System.out.println(String.format("Swapped %d & %d", el, list[i+1]));
                        list[i] = list [i+1];
                        list[i+1] = el;
                    }
                }
            }
        }
        return Arrays.toString(list);
    }
}