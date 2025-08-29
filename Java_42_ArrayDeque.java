import java.util.ArrayDeque;

public class Java_42_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // add
        ad.add(25);
        ad.add(44);
        System.out.println(ad);

        // add at first
        ad.addFirst(11);
        System.out.println(ad);

        // remove
        ad.remove();
        System.out.println(ad);

        // check
        System.out.println(ad.isEmpty());

        System.out.println(ad.size());
    }
}
