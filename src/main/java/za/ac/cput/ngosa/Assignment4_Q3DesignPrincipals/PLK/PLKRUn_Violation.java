package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.PLK;

/**
 * Created by User on 2015/09/12.
 */
public class PLKRUn_Violation {

    public static void main(String[] args)

    {
        String name;

        PLK_Correction plkCorrection= new PLK_Correction();

        plkCorrection.setfName("Bob");
        plkCorrection.setlName("Tim");

        PLK_Correction2 plk_correction2= new PLK_Correction2();

        plk_correction2.setfName(plkCorrection.getfName());
        plk_correction2.setlName(plkCorrection.getlName());


        name= plk_correction2.concat(plk_correction2.getfName(),plk_correction2.getlName());

        System.out.println(name);
    }
}
