import java.io.*;
import java.nio.file.*;

public class FileUtility {

    // Write text to a file (creates or overwrites)
    public static void writeToFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Read and display file contents line by line
    public static void readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nFILE CONTENT:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Append additional text to a file
    public static void appendToFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("\n" + content);
            writer.close();
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Modify file content by replacing specific text
    public static void modifyFile(String fileName, String target, String replacement) {
        try {
            // Read entire file as a single string
            String data = new String(Files.readAllBytes(Paths.get(fileName)));

            // Replace target word with new word
            data = data.replace(target, replacement);

            // Write updated content back to file
            Files.write(Paths.get(fileName), data.getBytes());
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Main method to demonstrate all file operations
    public static void main(String[] args) {

        String fileName = "sample.txt";

        // Write initial content
        writeToFile(fileName, "Hello, this is the ORIGINAL file content.");

        // Read file content
        readFile(fileName);

        // Append new content
        appendToFile(fileName, "This line was APPENDED later.");

        // Modify text inside the file
        modifyFile(fileName, "ORIGINAL", "UPDATED");

        // Read again to display final content
        readFile(fileName);
    }
}