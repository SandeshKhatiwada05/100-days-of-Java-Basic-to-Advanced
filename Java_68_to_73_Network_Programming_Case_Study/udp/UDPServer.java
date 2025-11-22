package org.network.udp;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("UDP Server waiting...");
        socket.receive(packet);

        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + received);

        String reply = "Echo: " + received;
        DatagramPacket response = new DatagramPacket(reply.getBytes(), reply.length(), packet.getAddress(), packet.getPort());
        socket.send(response);

        socket.close();
    }
}