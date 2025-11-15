package org.network.udp;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        String msg = "Hello from UDP Client!";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), address, 8888);
        socket.send(packet);

        byte[] buffer = new byte[1024];
        DatagramPacket response = new DatagramPacket(buffer, buffer.length);
        socket.receive(response);

        String reply = new String(response.getData(), 0, response.getLength());
        System.out.println("Server replied: " + reply);

        socket.close();
    }
}