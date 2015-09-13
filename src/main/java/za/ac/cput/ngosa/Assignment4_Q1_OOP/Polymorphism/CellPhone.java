package za.ac.cput.ngosa.Assignment4_Q1_OOP.Polymorphism;

/**
 * Created by User on 2015/09/11.
 */
public abstract class CellPhone {

    public String getGen(String gen){return gen;};
    public int getRam(int ram){return Integer.parseInt("G"+ram);}

}
