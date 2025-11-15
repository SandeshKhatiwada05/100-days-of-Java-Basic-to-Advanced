package org.network.tcp;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("Hello from TCP Client!");
        String response = in.readLine();
        System.out.println("Server replied: " + response);

        in.close();
        out.close();
        socket.close();
    }
}
