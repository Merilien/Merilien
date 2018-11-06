import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
    public static String containsSeven(ArrayList<Integer> list){
        String s = "Noooooo";
        if (list.contains(7)){
            s = "Hoorray";
        }
        return s;
    }
    public static String containsSeven2(ArrayList<Integer> list){
        String s = "Noooooo";
        for (int i = 0; i<list.size(); i++){
            if (list.get(i)== 7){
                s = "Hoorray";
            }
        }
        return s;
    }
}