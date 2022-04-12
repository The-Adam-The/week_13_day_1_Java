import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> themeParkList;

    public ThemePark() {
        this.themeParkList = new ArrayList<IReviewed>();

    }

    public void addItem(IReviewed item){
        this.themeParkList.add(item);
    }

    public IReviewed getItemByIndex(int indexNumber){
        return this.themeParkList.get(indexNumber);
    }

    public ArrayList<IReviewed> getAllItems(){
        return this.themeParkList;
    }

    public ArrayList<String> getAllRatings(){
        ArrayList<String> ratingList;
        String itemName;
        int itemRating;

        String review;

        ratingList = new ArrayList<String>();

        for (IReviewed item: themeParkList)
              {
                  itemName = item.getName();
                  itemRating = item.getRating();
                  review = itemName + " has a rating of " + itemRating;
            ratingList.add(review);
        }

        return ratingList;
    }


}
