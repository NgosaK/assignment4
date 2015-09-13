package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.LSP;

import java.util.Calendar;

/**
 * Created by User on 2015/09/11.
 */
public class LSP_Correction implements LSP_InterfaceCorrection {


    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public int getAge(int year) {
       int currYear = Calendar.getInstance().get(Calendar.YEAR);
        return currYear-year;
    }
}
