package behavioral.command;

import java.util.List;

//concrete command
public class DispenseCommand implements Command{

    private List<Bottle> bottles;

    public DispenseCommand(List<Bottle> bottles) {
        this.bottles = bottles;
    }

    @Override
    public void execute() {
        for(Bottle bottle: bottles) {
            if(bottle.getLevel() > 0) {
                bottle.dispense();
            } else {
                System.out.println(bottle.getName() + " contents depleted");
            }
        }
    }
}
