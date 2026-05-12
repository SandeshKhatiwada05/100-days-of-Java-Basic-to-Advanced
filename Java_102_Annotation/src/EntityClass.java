@ImportantClass(review = "this is an important class")
public class EntityClass {

    @ImportantField(review = "this is an important name field")
    String name;

    @ImportantField(review = "this is an important finisher field")
    String finisher;

    @ImportantField(review = "this is an important age field")
    Integer age;

    String height;

    @ImportantMethod(review = "This is a method for calculation")
    public void getInfo() {
        System.out.println("This is a method");
    }

    //constructor getters and setters

    public EntityClass(){}

    public EntityClass(String name, String finisher, Integer age) {
        this.name = name;
        this.finisher = finisher;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinisher() {
        return finisher;
    }

    public void setFinisher(String finisher) {
        this.finisher = finisher;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
