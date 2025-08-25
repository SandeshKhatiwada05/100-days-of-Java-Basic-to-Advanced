import java.util.ArrayList;

public class Java_40_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        // 1. Adding to list
        l1.add(34);
        l1.add(45);// -->34 45
        l2.add(91);

        // 2. Add at position
        l1.add(1, 11);// -->34 11 45

        // 3. Add ArrayList of l2 also
        l1.addAll(l2);// -->34 11 45 91

        // 4. Clears l2
        l2.clear();

        // 5. Check if it contains
        System.out.println(l1.contains(34));

        // 6. Delete Element via index
        l1.remove(1);// -->34 45 91

        // 7. Change the value
        l1.set(0, 99);// -->99 45 91

        // 8. Printing
        System.out.println(l1);

        // To Print in Loop
        for (int i = 0; i < l1.size(); i++) {// size() is same as length
            System.out.println(l1.get(i));
        }
    }
}
