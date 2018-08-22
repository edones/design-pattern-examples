package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Computer {

    protected List<Component> components = new ArrayList<>();

    public Computer() {
        this.createComputer();
    }

    public List<Component> getComponents() {
        return components;
    }

    public abstract void createComputer();
}
