import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decryptFile("duplicated-chars.txt");
    }

    public static void decryptFile(String file) {
        try {
            List<String> data = Files.readAllLines(Paths.get(file));
            List<String> decodedData = new ArrayList<>();
            for (String line : data) {
                String newLine = "";
                for (int i = 0; i < line.length(); i += 2) {
                    newLine += line.charAt(i);
                }
                decodedData.add(newLine);
            }
            Files.write(Paths.get("decoded.txt"), decodedData);
        } catch (IOException e) {
            System.out.println("Something's not OK...");
        }
    }
}