package SerializableObjectAndSocketProgramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server's IP address (use "localhost" if running on the same machine)
        int port = 9090; // Must match the server's port

        try (Socket socket = new Socket(serverAddress, port);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Connected to server: " + serverAddress + ":" + port);

            // Create a Student object
            Student myStudent = new Student(35, 28932, "khatiwadasandesh@gmail.com");
            System.out.println("Sending student data to server: " + myStudent.email);

            // Send the Student object to the server
            oos.writeObject(myStudent);

            // Receive response from the server
            Object receivedResponse = ois.readObject();
            if (receivedResponse instanceof String) {
                String responseMessage = (String) receivedResponse;
                System.out.println("Received response from server: " + responseMessage);
            }

            // Receive the Student object sent back from the server
            Object receivedServerStudent = ois.readObject();
            if (receivedServerStudent instanceof Student) {
                Student serverStudent = (Student) receivedServerStudent;
                System.out.println("Received server's student data:");
                System.out.println("ID: " + serverStudent.id);
                System.out.println("Roll No: " + serverStudent.rollNo);
                System.out.println("Email: " + serverStudent.email);
            }


        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in client: " + e.getMessage());
        }
    }
}