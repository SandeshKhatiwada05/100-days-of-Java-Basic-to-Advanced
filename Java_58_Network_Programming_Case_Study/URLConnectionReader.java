package org.network.url;

import java.io.*;
import java.net.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.khatiwadasandesh.com.np/");
        URLConnection connection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
