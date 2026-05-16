package bounded_generic;

public class Printer <T extends Wrestling> {

    T information;

    public Printer(T information) {
        this.information = information;
    }

    public T getInformation() {
        return information;
    }

    public void setInformation(T information) {
        this.information = information;
    }
}
