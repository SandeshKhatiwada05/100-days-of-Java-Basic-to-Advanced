package ClientServerFile;

// FileServer.java
import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws IOException {
        int port = 9876;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            String filePath = in.readUTF(); // Client sends file path
            File file = new File(filePath);

            if (file.exists() && file.isFile()) {
                out.writeUTF("OK");
                FileInputStream fis = new FileInputStream(file);
                byte[] buffer = new byte[4096];
                int bytes;
                while ((bytes = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, bytes);
                }
                fis.close();
            } else {
                out.writeUTF("ERROR");
            }

            clientSocket.close();
        }
    }
}