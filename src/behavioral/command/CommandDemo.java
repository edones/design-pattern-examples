package behavioral.command;

import java.util.ArrayList;
import java.util.List;


//client
public class CommandDemo {
    public static void main(String[] args) {
        List<Bottle> bottles = new ArrayList<>();

        //receiver
        Bottle ketchupBottle = new Bottle("Ketchup", 100);
        Bottle waterBottle = new Bottle("Water", 30);
        Bottle mayoBottle = new Bottle("Mayo", 50);

        bottles.add(ketchupBottle);
        bottles.add(waterBottle);
        bottles.add(mayoBottle);

        Command dispenseCommand = new DispenseCommand(bottles); //interface + concrete command
        //Command replenishCommand = new ReplenishCommand(Bottle bottle, int replenish);

        RoboSqueezer roboSqueezer = new RoboSqueezer(); //invoker
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);
        roboSqueezer.squeezeTheBottle(dispenseCommand);

        //todo: more sophisticated example
    }
}
