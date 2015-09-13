package za.ac.cput.ngosa.Assignment4_Q4.ADP_Violation.Package_A.ADP_Correction.Package_A;

import za.ac.cput.ngosa.Assignment4_Q4.ADP_Violation.Package_A.ADP_Correction.Package_B.ADP_B;

/**
 * Created by User on 2015/09/13.
 */
public class ADP_A extends ADP_B {

    public String carInfo()
    {
        return getCar()+getBrand();
    }
}
