package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.LSP;

import java.util.Calendar;

/**
 * Created by User on 2015/09/11.
 */
public class LSP_Violation implements LSP_InterfaceViolation {
    int currYear = Calendar.getInstance().get(Calendar.YEAR);


    @Override
    public String animalSound() {
        return "bark";
    }

    @Override
    public String carSound() {
        return "Revving";
    }

    public void setAge(int year)
    {
        this.currYear = (currYear - year);
    }

    public int getAge()
    {
        return this.currYear;
    }


}
