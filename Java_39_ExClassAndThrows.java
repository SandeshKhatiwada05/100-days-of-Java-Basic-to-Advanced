class AreaException extends Exception {
    @Override
    public String getMessage() {
        return "Make Sure The Radius is Positive!!";
    }
}

public class Java_39_ExClassAndThrows {

    // Use of Throws along with user defined exception
    public static void area(int r) throws AreaException {
        if (r < 0) {
            throw new AreaException();
        } else {
            System.out.println("Area of Circle: " + Math.PI * r * r);
        }
    }

    public static void main(String[] args) {
        try {
            area(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ThankYouu!!");
        }

    }
}
