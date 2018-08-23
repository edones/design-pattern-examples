package behavioral.command;

//invoker
public class RoboSqueezer {

    public void squeezeTheBottle(Command command) {
        command.execute();
    }
}
