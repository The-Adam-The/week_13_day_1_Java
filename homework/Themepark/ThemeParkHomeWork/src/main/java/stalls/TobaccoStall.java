package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    int ageLimit = 18;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        int visitorAge;

        visitorAge = visitor.getAge();

        if (visitorAge >= ageLimit){
            return true;
        } else {
            return false;
        }

    }
}
