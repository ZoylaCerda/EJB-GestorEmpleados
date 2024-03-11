package locals.util.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Employees implements Serializable {
    private String name;
    private String lastname;
    private int age;
    private String status;

    public Employees() {
    }

    public Employees(String name, String lastname, int age, String status) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                ", name: " + name + '\'' +
                ", lastname: " + lastname + '\'' +
                ", age: " + age +
                ", status: " + status + '\'';
    }
}
