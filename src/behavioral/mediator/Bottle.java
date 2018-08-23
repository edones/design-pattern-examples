package behavioral.mediator;

//receiver
public class Bottle {
    private String name;
    private int level;

    public Bottle(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void dispense() {
        level -= 10;
        System.out.println(name + " bottle dispensed. Level now at " + level);
    }

    public void replenish() {
        level = 100;
        System.out.println(name + " replenished. Level now at " + level);
    }

    public void empty() {
        level = 0;
        System.out.println(name + " emptied. Level now at " + level);
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
