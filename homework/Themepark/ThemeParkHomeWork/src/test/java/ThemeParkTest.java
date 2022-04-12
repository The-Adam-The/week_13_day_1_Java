import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;

import org.junit.Test;
import stalls.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {

        themePark = new ThemePark();

        dodgems = new Dodgems("Smashing Cars", 8);
        park = new Park("Green Park", 8);
        playground = new Playground("West Playground", 6 );
        rollerCoaster = new RollerCoaster("The Deathanator", 9);

        candyflossStall = new CandyflossStall("Sweet Clouds", "Jimmy Smits", ParkingSpot.B1, 8);
        iceCreamStall = new IceCreamStall("The Dip", "Mr White", ParkingSpot.A3, 7);
        tobaccoStall = new TobaccoStall("Mr Coughs", "Mr Cough", ParkingSpot.B2, 3);
    }

    @Test
    public void canAddAttractions() {
        themePark.addItem(dodgems);
        assertEquals(dodgems, themePark.getItemByIndex(0));
    }

    @Test
    public void canAddStalls() {
        themePark.addItem(candyflossStall);
        assertEquals(candyflossStall, themePark.getItemByIndex(0));
    }

    @Test
    public void canReturnFullListOfItems() {
        themePark.addItem(rollerCoaster);
        themePark.addItem(tobaccoStall);
        assertEquals(themePark.themeParkList, themePark.getAllItems());
    }

    @Test
    public void canReturnFullListOfRatings(){
        themePark.addItem(rollerCoaster);
        themePark.addItem(tobaccoStall);
        assertEquals(Arrays.asList("The Deathanator has a rating of 9", "Mr Coughs has a rating of 3"), themePark.getAllRatings());
    }
}

