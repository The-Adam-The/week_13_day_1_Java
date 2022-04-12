package behaviours;

import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ISecurityTest {

    Playground playground;
    RollerCoaster rollerCoaster;

    TobaccoStall tobaccoStall;

    Visitor visitor;
    Visitor visitorTwo;
    Visitor visitorThree;
    Visitor visitorFour;


    @Before
    public void before() {

        playground = new Playground("Waterland", 3);
        rollerCoaster = new RollerCoaster("Killer", 7);

        tobaccoStall = new TobaccoStall("lungers", "Coughing Paul", ParkingSpot.A4, 5);

        visitor = new Visitor(8, 90, 100);
        visitorTwo = new Visitor(28, 190, 1000);
        visitorThree = new Visitor(9,160, 0);
        visitorFour = new Visitor(18, 90, 390);


    }

    @Test
    public void playgroundHasAgeLimitTrue() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void playgroundHasAgeLimitFalse() {
        assertEquals(false, playground.isAllowedTo(visitorTwo));
    }

    @Test
    public void rollerCoasterHasAgeAndHeightLimitTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorTwo));
    }

    @Test
    public void rollerCoasterHasAgeAndHeightLimitFalseTooYoungTooShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void rollerCoasterHasAgeAndHeightLimitFalseTooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorThree));
    }

    @Test
    public void rollerCoasterHasAgeAndHeightLimitFalseTooShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorFour));
    }

    @Test
    public void tobaccoStallHasAgeLimitTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorTwo));
    }

}
