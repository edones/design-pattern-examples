package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Bottle> bottles = new ArrayList<>();

    public void registerBottle(Bottle bottle) {
        bottles.add(bottle);
    }

    public void replenishBottles() {
        for(Bottle bottle : bottles) {
            if(bottle.getLevel() < 100) {
                bottle.replenish();
            }
        }
    }

    public void emptyBottles() {
        for(Bottle bottle : bottles) {
            if(bottle.getLevel() > 0) {
                bottle.empty();
            }
        }
    }
}
