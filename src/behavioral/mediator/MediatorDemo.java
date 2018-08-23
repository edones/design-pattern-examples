package behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Bottle shampooBottle = new Bottle("Shampoo", 40);
        Bottle beerBottle = new Bottle("Beer", 0);
        Bottle ketchupBottle = new Bottle("Ketchup", 10);
        Bottle emptyBottle = new Bottle("Empty", 0);
        Bottle fullBottle = new Bottle("Full", 100);

        Mediator mediator = new Mediator();
        mediator.registerBottle(shampooBottle);
        mediator.registerBottle(beerBottle);
        mediator.registerBottle(ketchupBottle);
        mediator.registerBottle(emptyBottle);
        mediator.registerBottle(fullBottle);

        Command bottleCommand = new BottleCommand(mediator);

        bottleCommand.execute();

    }
}
