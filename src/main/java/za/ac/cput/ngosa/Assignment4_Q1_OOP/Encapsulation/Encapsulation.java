package za.ac.cput.ngosa.Assignment4_Q1_OOP.Encapsulation;

/**
 * Created by User on 2015/09/11.
 */
public class Encapsulation {

    private String name;
    private int age;

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String cellPhone;
}
