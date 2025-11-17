package CircleCalculation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CircleCalulationServer {
    public static void main(String[] args) {
        int port = 9091;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port: "+ port + ".....");
            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to client");

                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

                Double radius = in.readDouble();
                System.out.println("Recieved from client: "+ radius);

                //send back the same object
                //circle area calculation
                Double area = (3.142857)*radius*radius;
                out.writeDouble(area);

                in.close();
                out.close();
                clientSocket.close();
                System.out.println("Connection closed");
                System.exit(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
