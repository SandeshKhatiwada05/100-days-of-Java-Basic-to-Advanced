package ClientServerFile;

// FileClient.java
import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws IOException {
        String serverIP = "localhost";
        int port = 9876;

        Socket socket = new Socket(serverIP, port);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter full file path (on server): ");
        String filePath = input.readLine();

        out.writeUTF(filePath);

        String response = in.readUTF();

        if (response.equals("OK")) {
            System.out.println("Receiving file contents:");
            byte[] buffer = new byte[4096];
            int bytes;
            while ((bytes = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytes);
            }
        } else {
            System.out.println("ERROR: File not found on server.");
        }

        socket.close();
    }
}