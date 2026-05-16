package bounded_generic;

public class AEW extends Wrestling{

    private String creativeFreedom;

    public AEW(String creativeFreedom) {
        this.creativeFreedom = creativeFreedom;
    }

    public AEW(int id, String name, String creativeFreedom) {
        super(id, name);
        this.creativeFreedom = creativeFreedom;
    }

    public String getCreativeFreedom() {
        return creativeFreedom;
    }

    public void setCreativeFreedom(String creativeFreedom) {
        this.creativeFreedom = creativeFreedom;
    }
}
