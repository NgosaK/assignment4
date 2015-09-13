package za.ac.cput.ngosa.Assignment4_Q2Composition;

/**
 * Created by User on 2015/09/11.
 */
public class Car implements Vehicle {
    @Override
    public String engine(String eng) {
        return eng;
    }

    @Override
    public int numOfSeats(int seats) {
        return seats;
    }
}
