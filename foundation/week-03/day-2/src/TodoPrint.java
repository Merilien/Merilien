public class TodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        StringBuilder builder = new StringBuilder();
        builder.append("My todo:\n");
        builder.append(todoText);
        builder.append(" - Download games\n");
        builder.append("\t - Diablo");
        todoText = builder.toString();

        System.out.println(todoText);
    }
}