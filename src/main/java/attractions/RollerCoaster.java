package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getHeight() >= 145.00) && (visitor.getAge() > 12));
    }



    public double defaultPrice() {
        return 10.00;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() < 200){
            return defaultPrice();
        }else{
            return defaultPrice() * 2;
        }
    }
}
