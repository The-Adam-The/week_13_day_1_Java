package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    double price = 4.50;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        int visitorAge;

        visitorAge = visitor.getAge();
        if (visitorAge <= 12) {
            return price / 2;
        } else {
            return price;
        }
    }
}
