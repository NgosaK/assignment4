package za.ac.cput.ngosa.Assignment4_Q3DesignPrincipals.PLK;

/**
 * Created by User on 2015/09/12.
 */
public class PLKRun_Correction {

    public static void main(String[] args)
    {
        String name;

        PLK_Correction plkCorrection= new PLK_Correction();

        plkCorrection.setfName("Bob");
        plkCorrection.setlName("Tim");

        PLK_Correction2 plk_correction2= new PLK_Correction2();


        name= plk_correction2.concat(plkCorrection.getfName(),plkCorrection.getlName());

        System.out.println(name);
    }
}
