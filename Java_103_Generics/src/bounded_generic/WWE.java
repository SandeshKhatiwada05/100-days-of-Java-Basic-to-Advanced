package bounded_generic;

public class WWE extends Wrestling{

    private String payGap;

    public WWE(String payGap) {
        this.payGap = payGap;
    }

    public WWE(int id, String name, String payGap) {
        super(id, name);
        this.payGap = payGap;
    }

    public String getPayGap() {
        return payGap;
    }

    public void setPayGap(String payGap) {
        this.payGap = payGap;
    }
}
