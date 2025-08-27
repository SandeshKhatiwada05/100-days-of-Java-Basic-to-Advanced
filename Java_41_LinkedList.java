import java.util.LinkedList;

public class Java_41_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(45);
        ll.add(99);// -->45 99
        System.out.println(ll);

        ll.removeFirst();// ->99
        System.out.println(ll);

        ll.addFirst(21);// -->21 99
        System.out.println(ll);

        // Push As in Stack
        ll.push(66);// ->66
        System.out.println(ll);// ->66 21 99

        ll.add(67);

    }
}
