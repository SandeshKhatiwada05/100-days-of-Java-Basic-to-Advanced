package ClientServerSocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    private static ServerSocket server;
    private static int port = 9876;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        server = new ServerSocket(port);
        System.out.println("Server started. Listening on port " + port);

        while (true) {
            System.out.println("Waiting for a client connection...");
            Socket socket = server.accept();
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());

            try (
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())
            ) {

                String message;
                // Read multiple messages from same client
                while ((message = (String) ois.readObject()) != null) {
                    System.out.println("Message Received from client: " + message);

                    // Respond
                    String responseMessage = "Server received: " + message;
                    oos.writeObject(responseMessage);
                    System.out.println("Sent response to client: " + responseMessage);

                    // Break both loops if "exit"
                    if (message.equalsIgnoreCase("exit")) {
                        System.out.println("Received 'exit'. Closing connection.");
                        socket.close();
                        server.close();
                        System.out.println("Server shut down.");
                        return;
                    }
                }

            } catch (IOException e) {
                System.err.println("Error handling client: " + e.getMessage());
            } finally {
                if (socket != null && !socket.isClosed()) {
                    try {
                        socket.close();
                        System.out.println("Client socket closed.");
                    } catch (IOException e) {
                        System.err.println("Error closing client socket: " + e.getMessage());
                    }
                }
            }
        }
    }
}
