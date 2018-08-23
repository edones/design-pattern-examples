package behavioral.mediator;

public class BottleCommand implements Command {
    private Mediator mediator;

    public BottleCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.replenishBottles();
        mediator.emptyBottles();
    }
}
