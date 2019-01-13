import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decryptFile("reversed-lines.txt");
    }

    public static void decryptFile(String file) {
        try {
            List<String> data = Files.readAllLines(Paths.get(file));
            List<String> decodedData = new ArrayList<>();
            for (String line : data) {
                String newLine = "";
                for (int i = 0; i < line.length(); i++) {
                    newLine += line.charAt(line.length() - 1 - i);
                }
                decodedData.add(newLine);
            }
            Files.write(Paths.get("reversed.txt"), decodedData);
        } catch (IOException e) {
            System.out.println("Something's not OK...");
        }
    }
}