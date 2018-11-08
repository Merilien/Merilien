import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makeMatches(girls, boys));
    }

    public  static ArrayList<String> makeMatches(ArrayList<String> l1, ArrayList<String> l2){
        // poor Jeff
        ArrayList<String> zip = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++){
            zip.add(l1.get(i));
            zip.add(l2.get(i));
        }
        return zip;
    }
}