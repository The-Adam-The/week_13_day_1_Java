package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private int ageLimit = 12;
    private int heightLimit = 145;
    private double price = 8.50;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        int visitorAge;
        double visitorHeight;

        visitorAge = visitor.getAge();
        visitorHeight = visitor.getHeight();

        if (visitorAge >= ageLimit && visitorHeight >= heightLimit ) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        double visitorHeight;
        visitorHeight = visitor.getHeight();

        if (visitorHeight >= 200){
            return price * 2;
        } else {
            return price;
        }
    }
}

