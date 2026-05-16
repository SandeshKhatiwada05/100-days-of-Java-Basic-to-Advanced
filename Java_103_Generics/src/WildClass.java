import java.util.ArrayList;
import java.util.List;

public class WildClass {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,4);
        listCalculator(integerList);

        List<String> stringList = List.of("Sandesh", "San", "Mr S");
        listCalculator(stringList);
    }

    //pass in list of any wild card type
    public static void listCalculator(List<?> mylist){
        mylist.stream().forEach(value -> System.out.println(value));
    }
}
