package CircleCalculation;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class CircleCalulationClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 9091;

        try(Socket socket = new Socket(serverAddress, port)){
            DataOutputStream out = new DataOutputStream((socket.getOutputStream()));
            DataInputStream in = new DataInputStream(socket.getInputStream());

            //send to sever
            double radius = 5.0;
            out.writeDouble(radius);
            System.out.println("Radius send to server: "+ radius);

            //receive back the same bdata
            double response = in.readDouble();
            System.out.println("Recieved from server: "+ response);
            in.close();
            out.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
