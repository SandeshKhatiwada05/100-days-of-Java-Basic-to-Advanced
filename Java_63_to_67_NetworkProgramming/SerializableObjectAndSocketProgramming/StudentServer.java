package SerializableObjectAndSocketProgramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer {
    public static void main(String[] args) {
        int port = 9090; // Choose an available port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Listening on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                     ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream())) {

                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                    // Receive Student object from client
                    Object receivedObject = ois.readObject();
                    if (receivedObject instanceof Student) {
                        Student student = (Student) receivedObject;
                        System.out.println("Received Student information from client:");
                        System.out.println("ID: " + student.id);
                        System.out.println("Roll No: " + student.rollNo);
                        System.out.println("Email: " + student.email);

                        // Send a confirmation or another Student object back to the client
                        String responseMessage = "Server received your student data: " + student.email;
                        oos.writeObject(responseMessage);
                        System.out.println("Sent response to client: " + responseMessage);

                        // Optionally, send a new Student object back to the client
                        Student serverStudent = new Student(student.id, student.rollNo, student.email);
                        oos.writeObject(serverStudent);
                        System.out.println("Sent server's student data to client: " + serverStudent.email);

                    } else {
                        System.out.println("Received an unknown object from client: " + receivedObject.getClass().getName());
                    }

                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        }
    }
}