public class generic_method {
    public static void main(String[] args) {
        helloThere(1, 1);
        helloThere("Raj", true);

        String randomTypeNowAsString = helloRandomReturnType("Sandesh I guess");
        System.out.println(randomTypeNowAsString);
        Integer randomTypeNowAsInt = helloRandomReturnType(7);
        System.out.println(randomTypeNowAsInt);

    }

    public static <T,U> void helloThere(T here, U there) {
        System.out.println("Hello Whoever you are " + here);
    }

    //generic type can be even return type
    public static <RandomType> RandomType helloRandomReturnType(RandomType mrWho){
        return mrWho;
    }
}
