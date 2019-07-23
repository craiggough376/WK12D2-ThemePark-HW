package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    public double defaultPrice() {
        return 5.00;
    }


    public double priceFor(Visitor visitor) {
        if(visitor.getAge() >= 12){
            return defaultPrice();
        }else{
            return defaultPrice() * 0.5;
        }
    }
}
