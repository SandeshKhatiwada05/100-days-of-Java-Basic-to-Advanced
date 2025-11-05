import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.facebook.com");
        System.out.println(address);
        InetAddress ia[] = InetAddress.getAllByName("www.google.com");
        for (int i=0; i< ia.length; i++){
            System.out.println(ia[i]);
        }
    }
}
