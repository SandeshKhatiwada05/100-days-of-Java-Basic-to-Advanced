package ClientServerSocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress; // To get the computer's address
import java.net.Socket;     // The client's "phone"

public class SocketClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost();
        int port = 9876;

        // --- IMPORTANT: Establish the connection once outside the loop ---
        try (Socket socket = new Socket(host.getHostName(), port);
             // --- IMPORTANT: Keep streams open for the duration of the client's session ---
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Connected to server: " + host.getHostName() + ":" + port);

            for (int i = 0; i < 5; i++) { // We want to send 5 messages
                String messageToSend;
                if (i == 4) {
                    messageToSend = "exit"; // On the last message, we'll tell the server to shut down
                } else {
                    messageToSend = "" + i; // Otherwise, send a number
                }

                System.out.println("Sending request to socket server: " + messageToSend);
                oos.writeObject(messageToSend); // Send the object

                // Read the response from the server
                String messageReceived = (String) ois.readObject(); // "Now I'm listening... what did they say?"
                System.out.println("Message Received from server: " + messageReceived); // "They said: [response]"

                Thread.sleep(1000); // Wait for a second before sending the next message
            }

        } catch (IOException e) {
            System.err.println("Error in client: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for debugging
        }
    }
}