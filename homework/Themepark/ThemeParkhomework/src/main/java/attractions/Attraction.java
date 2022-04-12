package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.IVisit;

public abstract class Attraction implements IReviewed, IVisit {
    private String name;
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void incrementVisitCount() {
        this.visitCount += 1;
    }


}