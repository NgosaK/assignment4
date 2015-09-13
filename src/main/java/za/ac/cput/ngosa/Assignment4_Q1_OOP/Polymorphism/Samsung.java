package za.ac.cput.ngosa.Assignment4_Q1_OOP.Polymorphism;

/**
 * Created by User on 2015/09/11.
 */
public class Samsung extends CellPhone implements Android {
    @Override
    public String operatingSystem(String os) {
        return os;
    }

    @Override
    public String getGen(String gen) {
        return gen;
    }

    ;


    @Override
    public int getRam(int ram) {
        return Integer.parseInt("G" + ram);
    }

}