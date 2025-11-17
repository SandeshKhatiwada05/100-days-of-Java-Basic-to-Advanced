package SerializableObjectAndSocketProgramming;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    int rollNo;
    String email;

    public Student(int id, int rollNo, String email){
        this.id = id;
        this.rollNo = rollNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", rollNo=" + rollNo +
                ", email='" + email + '\'' +
                '}';
    }
}