public class Wrestler {

    private final String name;
    private String finisher;

    public Wrestler(String name, String finisher){
        this.name = name;
        this.finisher = finisher;
    }

    public String getName() {
        return name;
    }

    public String getFinisher() {
        return finisher;
    }

    public void setFinisher(String finisher) {
        this.finisher = finisher;
    }

    public void stamina(){
        System.out.println("99% Stamina");
    }

    public void championshipWins(int belts){
        System.out.println(belts + " championships");
    }

    private void privateMethodForSalary(){
        System.out.println("Its private that Minimum salary of wrestler is $600000");
    }

    private static void entrance(){
        System.out.println("Everyone gets atleast one Pyro in their entrance");
    }
}
