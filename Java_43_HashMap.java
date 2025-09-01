
import java.util.HashMap;

public class Java_43_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("Sandesh", 22);
        hash.put("Samjhana", 48);
        System.out.println(hash);

        //to get specific id
        System.out.println(hash.get("Sandesh"));

    }
}
