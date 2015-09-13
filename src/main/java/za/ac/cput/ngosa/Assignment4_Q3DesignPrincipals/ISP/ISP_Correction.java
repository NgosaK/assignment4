package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.ISP;

/**
 * Created by User on 2015/09/12.
 */
public class ISP_Correction implements ISP_CorrectionInterface {
    @Override
    public int add(int a, int b) {
        return (a+b);
    }

    @Override
    public int sub(int a, int b) {
        return (a-b);
    }
}
