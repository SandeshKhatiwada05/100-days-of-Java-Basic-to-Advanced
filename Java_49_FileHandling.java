import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Java_49_FileHandling {
    public static void main(String[] args) throws Exception {

        // Step 1: Open or create a file to write into
        FileWriter fw = new FileWriter("Java_49_FileHandling.txt");

        // Step 2: Make writing faster using BufferedWriter
        // 'try' block closes it automatically
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            // Write a message to the file
            bw.write("Hello, I am Sandesh, and this is a File Handling Approach");
        }

        // Step 3: Open the file to read from
        FileReader fr = new FileReader("Java_49_FileHandling.txt");

        // Step 4: Make reading faster using BufferedReader
        // 'try' block closes it automatically
        try (BufferedReader br = new BufferedReader(fr)) {
            // Read and print the first line from the file
            System.out.println(br.readLine());
        }

        // No need to close manually — 'try' handles it
    }
}
