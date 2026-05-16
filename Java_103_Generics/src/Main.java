public class Main {
    public static void main(String[] args) {
        PrintValue<Integer> integerValue = new PrintValue<>(5);
        System.out.println(integerValue.getValue());

        PrintValue<String> stringPrintValue = new PrintValue<>("Sandesh");
        System.out.println(stringPrintValue.getValue());

        PrintValue<Boolean> booleanPrintValue = new PrintValue<>(true);
        System.out.println(booleanPrintValue.getValue());
    }
}