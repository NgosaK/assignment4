package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import za.ac.cput.ngosa.Assignment4_Q1_OOP.Encapsulation.Encapsulation;
import za.ac.cput.ngosa.Assignment4_Q1_OOP.Inheritance.Boat;
import za.ac.cput.ngosa.Assignment4_Q1_OOP.Inheritance.Car;
import za.ac.cput.ngosa.Assignment4_Q1_OOP.Inheritance.Train;
import za.ac.cput.ngosa.Assignment4_Q1_OOP.Polymorphism.Samsung;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    //Test Encapsulation
    public void testEncapsulation()
    {
        Encapsulation encapsulation= new Encapsulation();
        encapsulation.setAge(23);
        encapsulation.setCellPhone("0095958686");
        encapsulation.setName("John");

        assertEquals("John",encapsulation.getName());
        assertEquals("0095958686",encapsulation.getCellPhone());
        assertEquals(23,encapsulation.getAge());
    }


    //Test Polymorphism
    public void testPolymorphism()
    {
        Samsung samsung= new Samsung();
        assertEquals("Jelly Bean",samsung.operatingSystem("Jelly Bean"));
        assertEquals(4,samsung.getRam(4));
        assertEquals("ggd",samsung.getGen("ggd"));

    }

    //Test Inheritance
    public void testInheritance()
    {
        Train train= new Train();
        Boat boat= new Boat();
        Car car= new Car();

        assertEquals(50,train.numOfSeats(50));
        assertEquals("bi turbo",boat.engine("bi turbo"));
        assertEquals(4,car.numOfSeats(4));
    }



}
