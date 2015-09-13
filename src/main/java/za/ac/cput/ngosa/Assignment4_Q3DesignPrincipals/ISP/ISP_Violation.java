package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.ISP;

/**
 * Created by User on 2015/09/12.
 */
public class ISP_Violation implements ISP_ViolationInterface {
    @Override
    public int add(int a, int b) {
        return (a+b);
    }

    @Override
    public int sub(int a, int b) {
        return (a-b);
    }

    @Override
    public String getFirstName(String name) {
        return name;
    }

    @Override
    public String getLastName(String name) {
        return name;
    }
}
