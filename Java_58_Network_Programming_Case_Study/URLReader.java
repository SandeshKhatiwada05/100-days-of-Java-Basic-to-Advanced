package org.network.url;

import java.net.*;
import java.util.Scanner;

public class URLReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://github.com/SaisaKoirala");
        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
