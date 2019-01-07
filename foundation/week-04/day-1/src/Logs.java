// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        try {
            List<String> data = Files.readAllLines(Paths.get("log.txt"));
            System.out.println(getIPs(data));
            System.out.println(getRatio(data));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't read file");
        }
    }

    public static ArrayList<String> getIPs(List<String> data){
        ArrayList<String> IPs = new ArrayList<>();
        for (String line : data) {
            String IP = line.split(" ")[8];
            if (!IPs.contains(IP)){
                IPs.add(IP);
            }
        }
        return IPs;
    }

    public static double getRatio(List<String> data){
        double getCount = 0;
        double postCount = 0;
        for (String line : data){
            String method = line.split(" ")[11];
            if (method.equals("GET")){
                getCount++;
            }
            else if (method.equals("POST")){
                postCount++;
            }
        }
        return getCount/postCount;
    }
}