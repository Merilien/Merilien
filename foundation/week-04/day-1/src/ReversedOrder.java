import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        decryptFile("reversed-order.txt");
    }
    public static void decryptFile(String file){
        try {
            List<String> data = Files.readAllLines(Paths.get(file));
            List<String> decodedData = new ArrayList<>();
            for (int i = data.size()-1; i >= 0 ; i--) {
                decodedData.add(data.get(i));
            }
            Files.write(Paths.get("order-reversed.txt"), decodedData);
        } catch (IOException e) {
            System.out.println("Something's not OK...");
        }
    }
}