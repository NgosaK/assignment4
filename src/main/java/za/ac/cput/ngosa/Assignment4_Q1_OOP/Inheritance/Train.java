package za.ac.cput.ngosa.Assignment4_Q1_OOP.Inheritance;

/**
 * Created by User on 2015/09/11.
 */
public class Train extends Vehicle {
    @Override
    public String engine(String eng) {
        return super.engine(eng);
    }

    @Override
    public int numOfSeats(int seats) {
        return super.numOfSeats(seats);
    }
}
