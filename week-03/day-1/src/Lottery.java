import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        System.out.println(findMostCommons("lottery.csv"));
    }

    public static ArrayList<String> findMostCommons(String file){
        HashMap<String, Integer> counts = new HashMap<>();
        try{
            for (String line : Files.readAllLines(Paths.get(file))){
                String[] splitLine = line.split(";");
                for (int i = 11; i < 16; i++) {
                    String num = splitLine[i];
                    if (counts.containsKey(num)){
                        int count = counts.get(num);
                        counts.put(num, count + 1);
                    }
                    else {
                        counts.put(num, 1);
                    }
                }
            }
        } catch (IOException e){
            System.out.println("Can't read file.");
        }

        ArrayList<String> maxcounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int max = 0;
            String maxKey = "";
            for (String key : counts.keySet()) {
                if (counts.get(key) > max) {
                    max = counts.get(key);
                    maxKey = key;
                }
            }
            maxcounts.add(maxKey);
            counts.remove(maxKey);
        }
        return maxcounts;
    }
}