package bounded_generic;

public class MainGeneric {
    public static void main(String[] args) {
        Printer<AEW> aew = new Printer<>(new AEW("Full freedom for main talents"));
        System.out.println(aew.getInformation());

        Printer<WWE> wwe = new Printer<>(new WWE("Huge pay gaps in industry"));
        System.out.println(wwe.getInformation());
    }

}
